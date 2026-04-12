package com.gla.Generics_Collections.Collection;

import java.util.*;

class Booking {
    String user;
    String type;
    Booking(String user, String type) {
        this.user = user;
        this.type = type;
    }

    public String toString() {
        return user + " | " + type;
    }
}
public class EventSystem {
    public static void main(String[] args) {
        List<Booking> allBookings = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> normalQueue = new LinkedList<>();

        PriorityQueue<Booking> vipQueue =
                new PriorityQueue<>((a, b) -> {
                    if (a.type.equals(b.type)) return 0;
                    if (a.type.equals("VIP")) return -1;
                    return 1;
                });

        addUser(users, normalQueue, vipQueue, new Booking("Aman", "VIP"));
        addUser(users, normalQueue, vipQueue, new Booking("Riya", "NORMAL"));
        addUser(users, normalQueue, vipQueue, new Booking("Neha", "VIP"));
        addUser(users, normalQueue, vipQueue, new Booking("Aman", "VIP")); // duplicate ignored

        System.out.println("Processing VIP first:");
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.remove();
            System.out.println("Confirmed: " + b);
            allBookings.add(b);
        }

        System.out.println("\nProcessing Normal:");
        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.remove();
            System.out.println("Confirmed: " + b);
            allBookings.add(b);
        }

        System.out.println("\nAll Bookings:");
        for (Booking b : allBookings) {
            System.out.println(b);
        }
    }

    static void addUser(Set<String> users,
                        Queue<Booking> normal,
                        PriorityQueue<Booking> vip,
                        Booking b) {

        if (!users.contains(b.user)) {
            users.add(b.user);

            if (b.type.equals("VIP")) {
                vip.add(b);
            } else {
                normal.add(b);
            }
        }
    }
}
