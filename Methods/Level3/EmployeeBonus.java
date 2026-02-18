package com.gla.Methods.Level3;
import java.util.Random;
public class EmployeeBonus {
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary between 10000 and 99999
            int years = 1 + rand.nextInt(10); // years of service between 1 and 10
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] newData = new double[data.length][3]; // old salary, bonus, new salary
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    public static void displaySummary(double[][] newData) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
        System.out.printf("%-10s %-12s %-10s %-12s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < newData.length; i++) {
            System.out.printf("%-10d %-12.2f %-10.2f %-12.2f\n", i + 1, newData[i][0], newData[i][1], newData[i][2]);
            totalOldSalary += newData[i][0];
            totalBonus += newData[i][1];
            totalNewSalary += newData[i][2];
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10.2f %-12.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] newData = calculateBonus(employeeData);
        displaySummary(newData);
    }
}
