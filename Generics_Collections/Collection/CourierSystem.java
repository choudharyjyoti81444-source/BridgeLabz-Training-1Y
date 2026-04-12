package com.gla.Generics_Collections.Collection;

import java.util.*;

class Parcel {
    String id;
    String name;
    int priority;
    Parcel(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return id + " | " + name + " | " + priority;
    }
}
public class CourierSystem {
    public static void main(String[] args) {
        Set<String> assignedIds = new HashSet<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        PriorityQueue<Parcel> priorityQueue =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);
        List<Parcel> completed = new ArrayList<>();

        addParcel("P1", "Mobile", 2, assignedIds, normalQueue, priorityQueue);
        addParcel("P2", "Laptop", 5, assignedIds, normalQueue, priorityQueue);
        addParcel("P3", "Shoes", 1, assignedIds, normalQueue, priorityQueue);
        addParcel("P1", "Mobile", 2, assignedIds, normalQueue, priorityQueue); // duplicate ignored

        System.out.println("Processing High Priority First:");
        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.remove();
            System.out.println("Delivered: " + p);
            completed.add(p);
        }

        System.out.println("\nProcessing Normal Deliveries:");
        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.remove();
            System.out.println("Delivered: " + p);
            completed.add(p);
        }

        System.out.println("\nCompleted Deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }

    static void addParcel(String id, String name, int priority,
                          Set<String> set,
                          Queue<Parcel> normal,
                          PriorityQueue<Parcel> high) {

        if (!set.contains(id)) {
            set.add(id);
            Parcel p = new Parcel(id, name, priority);
            if (priority >= 4) {
                high.add(p);
            } else {
                normal.add(p);
            }
        }
    }
}
