package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;
public class CustomerManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS customers(id INT, name VARCHAR(50), phone VARCHAR(15))");

            while (true) {
                System.out.println("\n1.Add Customer 2.Search 3.Update Phone 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id name phone: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String phone = sc.next();

                        st.executeUpdate("INSERT INTO customers VALUES(" + id + ",'" + name + "','" + phone + "')");
                        System.out.println("Inserted");
                        break;

                    case 2:
                        System.out.print("Enter name to search: ");
                        String sname = sc.next();

                        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE name LIKE '%" + sname + "%'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new phone: ");
                        String newPhone = sc.next();

                        st.executeUpdate("UPDATE customers SET phone='" + newPhone + "' WHERE id=" + uid);
                        System.out.println("Updated");
                        break;

                    case 4:
                        System.out.print("Enter id to delete: ");
                        int did = sc.nextInt();

                        st.executeUpdate("DELETE FROM customers WHERE id=" + did);
                        System.out.println("Deleted");
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
