package com.gla.Generics_Collections.Collection;

import java.util.*;

class RideRequest {
    String name;
    int priority;
    RideRequest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (" + priority + ")";
    }
}

class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Ride {
    String driver;
    String rider;

    Ride(String driver, String rider) {
        this.driver = driver;
        this.rider = rider;
    }

    public String toString() {
        return driver + " -> " + rider;
    }
}

public class RideSystem {
    public static void main(String[] args) {
        Queue<RideRequest> pending = new LinkedList<>();
        PriorityQueue<RideRequest> pq =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        Set<Driver> drivers = new HashSet<>();
        List<Ride> completed = new ArrayList<>();

        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));
        drivers.add(new Driver("D3"));

        pending.add(new RideRequest("R1", 2));
        pending.add(new RideRequest("R2", 5));
        pending.add(new RideRequest("R3", 1));

        pq.addAll(pending);
        System.out.println("Assigning Rides:");
        Iterator<Driver> it = drivers.iterator();

        while (!pq.isEmpty() && it.hasNext()) {
            RideRequest r = pq.poll();
            Driver d = it.next();

            System.out.println("Assigned: " + d + " -> " + r.name);
            completed.add(new Ride(d.name, r.name));
        }

        System.out.println("\nCompleted Rides:");
        for (Ride r : completed) {
            System.out.println(r);
        }
    }
}
