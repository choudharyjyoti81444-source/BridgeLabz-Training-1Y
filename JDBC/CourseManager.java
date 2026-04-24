package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class CourseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS enrollments(id INT, student VARCHAR(50), course VARCHAR(50))");

            while (true) {
                System.out.println("\n1.Add 2.Search Course 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id student course: ");
                        int id = sc.nextInt();
                        String stn = sc.next();
                        String c = sc.next();

                        st.executeUpdate("INSERT INTO enrollments VALUES(" + id + ",'" + stn + "','" + c + "')");
                        break;

                    case 2:
                        System.out.print("Enter course: ");
                        String course = sc.next();

                        ResultSet rs = st.executeQuery("SELECT * FROM enrollments WHERE course='" + course + "'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new course: ");
                        String nc = sc.next();

                        st.executeUpdate("UPDATE enrollments SET course='" + nc + "' WHERE id=" + uid);
                        break;

                    case 4:
                        System.out.print("Enter id: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM enrollments WHERE id=" + del);
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
