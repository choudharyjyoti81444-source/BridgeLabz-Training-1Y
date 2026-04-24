package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;
public class MenuManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS menu(id INT, itemName VARCHAR(50), price DOUBLE)");

            while (true) {
                System.out.println("\n1.Add 2.Show <200 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id item price: ");
                        int id = sc.nextInt();
                        String item = sc.next();
                        double price = sc.nextDouble();

                        st.executeUpdate("INSERT INTO menu VALUES(" + id + ",'" + item + "'," + price + ")");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM menu WHERE price < 200");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new price: ");
                        double np = sc.nextDouble();

                        st.executeUpdate("UPDATE menu SET price=" + np + " WHERE id=" + uid);
                        break;

                    case 4:
                        System.out.print("Enter id: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM menu WHERE id=" + del);
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
