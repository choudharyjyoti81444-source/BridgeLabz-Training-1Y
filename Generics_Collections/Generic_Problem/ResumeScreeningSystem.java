package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

abstract class JobRole {
    String roleName;
    JobRole(String roleName) {
        this.roleName = roleName;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;
    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public void showResume() {
        System.out.println(candidateName + " - " + role.roleName);
    }
}

public class ResumeScreeningSystem {
    public static void processRoles(List<? extends JobRole> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).roleName);
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Aman", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Riya", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Karan", new ProductManager());

        r1.showResume();
        r2.showResume();
        r3.showResume();

        List<SoftwareEngineer> l1 = new ArrayList<>();
        l1.add(new SoftwareEngineer());

        List<DataScientist> l2 = new ArrayList<>();
        l2.add(new DataScientist());

        List<ProductManager> l3 = new ArrayList<>();
        l3.add(new ProductManager());

        processRoles(l1);
        processRoles(l2);
        processRoles(l3);
    }
}
