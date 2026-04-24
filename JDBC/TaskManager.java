package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;
public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS tasks(id INT, title VARCHAR(100), status VARCHAR(20))");

            while (true) {
                System.out.println("\n1.Add 2.Show Pending 3.Complete 4.Delete 5.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter id title: ");
                        int id = sc.nextInt();
                        String title = sc.next();

                        st.executeUpdate("INSERT INTO tasks VALUES(" + id + ",'" + title + "','Pending')");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM tasks WHERE status='Pending'");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter id: ");
                        int uid = sc.nextInt();

                        st.executeUpdate("UPDATE tasks SET status='Completed' WHERE id=" + uid);
                        break;

                    case 4:
                        st.executeUpdate("DELETE FROM tasks WHERE status='Completed'");
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
