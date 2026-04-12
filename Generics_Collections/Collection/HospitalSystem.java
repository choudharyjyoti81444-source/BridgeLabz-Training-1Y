package com.gla.Generics_Collections.Collection;

import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Set<String> admittedSet = new HashSet<>();
        Queue<Patient> waitingQueue = new LinkedList<>();
        Stack<Patient> dischargedStack = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit("Aman", admittedSet, waitingQueue, history);
        admit("Riya", admittedSet, waitingQueue, history);
        admit("Neha", admittedSet, waitingQueue, history);
        admit("Aman", admittedSet, waitingQueue, history); // duplicate ignored

        System.out.println("Treating Patients:");
        while (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.remove();
            System.out.println("Treating: " + p);
            System.out.println("Discharging: " + p);
            dischargedStack.push(p);
        }

        System.out.println("\nRecently Discharged:");
        while (!dischargedStack.isEmpty()) {
            Patient p = dischargedStack.pop();
            System.out.println("Re-admit: " + p);
            waitingQueue.add(p);
        }

        System.out.println("\nFinal Queue After Re-admit:");
        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
    }

    static void admit(String name,
                      Set<String> set,
                      Queue<Patient> queue,
                      List<Patient> history) {

        if (!set.contains(name)) {
            set.add(name);
            Patient p = new Patient(name);
            queue.add(p);
            history.add(p);
        }
    }
}
