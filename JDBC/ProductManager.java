package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;
public class ProductManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS product(pid INT, pname VARCHAR(50), qty INT)");

            // Insert 3 default products
            st.executeUpdate("INSERT INTO product VALUES(1,'Pen',5)");
            st.executeUpdate("INSERT INTO product VALUES(2,'Book',20)");
            st.executeUpdate("INSERT INTO product VALUES(3,'Pencil',8)");

            while (true) {
                System.out.println("\n1.Show Low Stock 2.Update Qty 3.Delete Product 4.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        }
                        break;

                    case 2:
                        System.out.print("Enter product id: ");
                        int id = sc.nextInt();
                        System.out.print("Enter quantity to add: ");
                        int q = sc.nextInt();

                        st.executeUpdate("UPDATE product SET qty = qty + " + q + " WHERE pid=" + id);
                        System.out.println("Updated");
                        break;

                    case 3:
                        System.out.print("Enter product id to delete: ");
                        int did = sc.nextInt();

                        st.executeUpdate("DELETE FROM product WHERE pid=" + did);
                        System.out.println("Deleted");
                        break;

                    case 4:
                        con.close();
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
