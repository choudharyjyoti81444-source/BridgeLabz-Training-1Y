package com.gla.Threads;
class Order implements Runnable {
    private String orderId;
    private String restaurant;
    private int deliveryTime; // in seconds

    public Order(String orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        System.out.println("Order " + orderId + " picked up by " + Thread.currentThread().getName());
        try {
            System.out.println("Order " + orderId + " is In Transit...");
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order " + orderId + " delivered by " + Thread.currentThread().getName() +
                " | Total delivery time: " + deliveryTime + " sec\n");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order("O101", "Domino's", 4), "Agent1");
        Thread o2 = new Thread(new Order("O102", "Pizza Hut", 2), "Agent2");
        Thread o3 = new Thread(new Order("O103", "Burger King", 5), "Agent3");
        Thread o4 = new Thread(new Order("O104", "KFC", 3), "Agent4");
        Thread o5 = new Thread(new Order("O105", "Subway", 2), "Agent5");

        o1.setPriority(10); // Express
        o2.setPriority(5);  // Standard
        o3.setPriority(3);  // Economy
        o4.setPriority(5);  // Standard
        o5.setPriority(10); // Express

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}
