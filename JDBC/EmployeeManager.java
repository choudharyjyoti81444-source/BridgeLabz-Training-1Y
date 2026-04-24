package com.gla.JDBC;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            while (true) {
                System.out.println("\n1. Add Employee");
                System.out.println("2. Show Salary > 30000");
                System.out.println("3. Increase Salary by 10%");
                System.out.println("4. Delete Salary < 15000");
                System.out.println("5. Exit");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter id, name, salary: ");
                        int id = sc.nextInt();
                        String name = sc.next();
                        double sal = sc.nextDouble();

                        st.executeUpdate("INSERT INTO employee VALUES(" + id + ",'" + name + "'," + sal + ")");
                        System.out.println("Inserted");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary > 30000");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();
                        st.executeUpdate("UPDATE employee SET salary = salary * 1.10 WHERE id=" + uid);
                        System.out.println("Updated");
                        break;

                    case 4:
                        st.executeUpdate("DELETE FROM employee WHERE salary < 15000");
                        System.out.println("Deleted low salary employees");
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
