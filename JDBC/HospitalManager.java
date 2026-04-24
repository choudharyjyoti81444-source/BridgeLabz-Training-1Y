package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;
public class HospitalManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS patients(id INT, name VARCHAR(50), disease VARCHAR(50))");

            while (true) {
                System.out.println("\n1.Add 2.Search Disease 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id name disease: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String dis = sc.next();

                        st.executeUpdate("INSERT INTO patients VALUES(" + id + ",'" + name + "','" + dis + "')");
                        break;

                    case 2:
                        System.out.print("Enter disease: ");
                        String d = sc.next();

                        ResultSet rs = st.executeQuery("SELECT * FROM patients WHERE disease='" + d + "'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new disease: ");
                        String nd = sc.next();

                        st.executeUpdate("UPDATE patients SET disease='" + nd + "' WHERE id=" + uid);
                        break;

                    case 4:
                        System.out.print("Enter id: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM patients WHERE id=" + del);
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
