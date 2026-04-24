package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");

            while (true) {
                System.out.println("\n1.Add Book 2.Show Available 3.Issue Book 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id title author: ");
                        int id = sc.nextInt();
                        String title = sc.next();
                        String author = sc.next();

                        st.executeUpdate("INSERT INTO books VALUES(" + id + ",'" + title + "','" + author + "','Available')");
                        System.out.println("Inserted");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM books WHERE status='Available'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                        }
                        break;

                    case 3:
                        System.out.print("Enter book id: ");
                        int bid = sc.nextInt();

                        st.executeUpdate("UPDATE books SET status='Issued' WHERE id=" + bid);
                        System.out.println("Issued");
                        break;

                    case 4:
                        System.out.print("Enter book id to delete: ");
                        int did = sc.nextInt();

                        st.executeUpdate("DELETE FROM books WHERE id=" + did);
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
