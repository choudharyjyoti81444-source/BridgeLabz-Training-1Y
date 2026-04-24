package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;
public class GymManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS members(id INT, name VARCHAR(50), type VARCHAR(20), months INT)");

            while (true) {
                System.out.println("\n1.Add 2.Show Premium 3.Extend 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id name type months: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String type = sc.next();
                        int m = sc.nextInt();

                        st.executeUpdate("INSERT INTO members VALUES(" + id + ",'" + name + "','" + type + "'," + m + ")");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM members WHERE type='Premium'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter months to add: ");
                        int add = sc.nextInt();

                        st.executeUpdate("UPDATE members SET months = months + " + add + " WHERE id=" + uid);
                        break;

                    case 4:
                        System.out.print("Enter id: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM members WHERE id=" + del);
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
