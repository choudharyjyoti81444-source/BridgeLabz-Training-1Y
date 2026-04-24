package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;

public class VehicleManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS vehicles(regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20))");

            while (true) {
                System.out.println("\n1.Add 2.Show Pending 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter regNo owner status: ");
                        String r = sc.next();
                        String o = sc.next();
                        String s = sc.next();

                        st.executeUpdate("INSERT INTO vehicles VALUES('" + r + "','" + o + "','" + s + "')");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM vehicles WHERE status='Pending'");
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter regNo: ");
                        String rid = sc.next();

                        st.executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='" + rid + "'");
                        break;

                    case 4:
                        System.out.print("Enter regNo: ");
                        String del = sc.next();

                        st.executeUpdate("DELETE FROM vehicles WHERE regNo='" + del + "'");
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
