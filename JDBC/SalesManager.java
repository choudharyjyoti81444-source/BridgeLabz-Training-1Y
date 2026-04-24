package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class SalesManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS sales(id INT, bookName VARCHAR(100), quantity INT, price DOUBLE)");

            while (true) {
                System.out.println("\n1.Add 2.Show Qty>1 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id bookName quantity price: ");
                        int id = sc.nextInt();
                        String book = sc.next();
                        int q = sc.nextInt();
                        double p = sc.nextDouble();

                        st.executeUpdate("INSERT INTO sales VALUES(" + id + ",'" + book + "'," + q + "," + p + ")");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM sales WHERE quantity > 1");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new quantity: ");
                        int nq = sc.nextInt();

                        st.executeUpdate("UPDATE sales SET quantity=" + nq + " WHERE id=" + uid);
                        break;

                    case 4:
                        System.out.print("Enter id: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM sales WHERE id=" + del);
                        break;

                    case 5:
                        con.close();
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
