package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;
public class MovieManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS movies(id INT, name VARCHAR(50), seats INT)");

            while (true) {
                System.out.println("\n1.Add Movie 2.Show Available 3.Book Ticket 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id name seats: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        int seats = sc.nextInt();

                        st.executeUpdate("INSERT INTO movies VALUES(" + id + ",'" + name + "'," + seats + ")");
                        System.out.println("Inserted");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM movies WHERE seats > 0");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter movie id: ");
                        int mid = sc.nextInt();

                        st.executeUpdate("UPDATE movies SET seats = seats - 1 WHERE id=" + mid);
                        System.out.println("Ticket Booked");
                        break;

                    case 4:
                        System.out.print("Enter movie id to delete: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM movies WHERE id=" + del);
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
