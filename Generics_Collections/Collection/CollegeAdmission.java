package com.gla.Generics_Collections.Collection;
import java.util.*;

class Students {
    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " | " + marks;
    }
}
public class CollegeAdmission {
    public static void main(String[] args) {
        List<Students> applications = new ArrayList<>();
        Set<Students> shortlisted = new HashSet<>();
        Queue<Students> interviewQueue = new LinkedList<>();
        TreeSet<Students> meritList = new TreeSet<>(new Comparator<Students>() {
            public int compare(Students a, Students b) {
                return b.marks - a.marks;
            }
        });

        applications.add(new Students("Aman", 85));
        applications.add(new Students("Riya", 92));
        applications.add(new Students("Neha", 78));
        applications.add(new Students("Aman", 85)); // duplicate object (still added in list)

        System.out.println("All Applications:");
        for (Students s : applications) {
            System.out.println(s);
        }

        for (Students s : applications) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }

        System.out.println("\nShortlisted Students:");
        for (Students s : shortlisted) {
            System.out.println(s);
        }

        interviewQueue.addAll(shortlisted);

        System.out.println("\nInterview Process:");
        while (!interviewQueue.isEmpty()) {
            Students s = interviewQueue.remove();
            System.out.println("Interviewing: " + s);
            if (s.marks >= 85) {
                meritList.add(s);
            }
        }

        System.out.println("\nFinal Merit List:");
        for (Students s : meritList) {
            System.out.println(s);
        }
    }
}
