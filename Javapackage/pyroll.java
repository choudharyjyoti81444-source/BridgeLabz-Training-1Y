package com.gla.Javapackage;
public class pyroll {

        public double calculateBonus(Employee e) {

            double bonus = e.getSalary() * 0.10;
            double totalSalary = e.getSalary() + bonus;

            return totalSalary;
        }
    }
