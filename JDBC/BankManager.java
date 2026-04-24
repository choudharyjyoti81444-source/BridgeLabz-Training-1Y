package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;
public class BankManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");

            while (true) {
                System.out.println("\n1.Add 2.Show >10000 3.Deposit 4.Withdraw 5.Delete 6.Exit");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter accNo name balance: ");
                        int acc = sc.nextInt();
                        String name = sc.next();
                        double bal = sc.nextDouble();

                        st.executeUpdate("INSERT INTO accounts VALUES(" + acc + ",'" + name + "'," + bal + ")");
                        System.out.println("Inserted");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE balance > 10000");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
                        }
                        break;

                    case 3:
                        System.out.print("Enter accNo: ");
                        int did = sc.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();

                        st.executeUpdate("UPDATE accounts SET balance = balance + " + dep + " WHERE accNo=" + did);
                        System.out.println("Deposited");
                        break;

                    case 4:
                        System.out.print("Enter accNo: ");
                        int wid = sc.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double w = sc.nextDouble();

                        st.executeUpdate("UPDATE accounts SET balance = balance - " + w + " WHERE accNo=" + wid);
                        System.out.println("Withdrawn");
                        break;

                    case 5:
                        System.out.print("Enter accNo to delete: ");
                        int del = sc.nextInt();

                        st.executeUpdate("DELETE FROM accounts WHERE accNo=" + del);
                        System.out.println("Deleted");
                        break;

                    case 6:
                        con.close();
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
