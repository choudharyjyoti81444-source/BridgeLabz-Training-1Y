package com.gla.Threads;
class BankAccount implements Runnable {
    private String name;
    private String accountType;

    public BankAccount(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        int priority = Thread.currentThread().getPriority();
        for (int i = 1; i <= 3; i++) {
            System.out.println("User: " + name + " | Account: " + accountType +
                    " | Priority: " + priority + " | Checking balance... (" + i + ")");
            try {
                Thread.sleep(2000); // simulate 2 seconds balance check
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " finished checking balance.\n");
    }
}
public class BankSimulation {
    public static void main(String[] args) {
        BankAccount premium = new BankAccount("Alice", "Premium");
        BankAccount regular = new BankAccount("Bob", "Regular");
        BankAccount basic = new BankAccount("Charlie", "Basic");

        Thread t1 = new Thread(premium);
        Thread t2 = new Thread(regular);
        Thread t3 = new Thread(basic);

        t1.setPriority(10); // Premium
        t2.setPriority(5);  // Regular
        t3.setPriority(1);  // Basic

        t1.start();
        t2.start();
        t3.start();
    }
}
