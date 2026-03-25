package com.gla.Threads;
import java.util.Random;

class Ticket extends Thread {
    private String type;
    private int ticketNumber;

    public Ticket(int ticketNumber, String type) {
        this.ticketNumber = ticketNumber;
        this.type = type;
        setPriority(getPriorityByType(type));
        setName("Agent-" + ticketNumber);
    }

    private int getPriorityByType(String type) {
        switch (type) {
            case "Critical Bug": return 10;
            case "Feature Request": return 4;
            case "General Query": return 2;
            case "Feedback": return 1;
        }
        return 1;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int processingTime = rand.nextInt(5) + 1; // 1-5 seconds
        System.out.println("Ticket #" + ticketNumber + " [" + type + "] processing started by " + getName());
        try {
            Thread.sleep(processingTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ticket #" + ticketNumber + " [" + type + "] completed by " + getName() +
                " | Processing time: " + processingTime + " sec\n");
    }
}
public class SupportSystem {
    public static void main(String[] args) {
        String[] types = {"Critical Bug", "Feature Request", "General Query", "Feedback"};
        Ticket[] tickets = new Ticket[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            String type = types[rand.nextInt(types.length)];
            tickets[i] = new Ticket(i+1, type);
            tickets[i].start();
        }
    }
}
