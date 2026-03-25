package com.gla.Threads;
class Device implements Runnable {
    private String name;
    private int interval;
    private int priority;

    public Device(String name, int interval, int priority) {
        this.name = name;
        this.interval = interval;
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Device: " + name + " | Priority: " + priority +
                    " | Status update " + i + " at " + java.time.LocalTime.now());
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " completed 5 cycles.\n");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Thread tempSensor = new Thread(new Device("Temperature Sensor", 5, 7));
        Thread securityCam = new Thread(new Device("Security Camera", 3, 10));
        Thread lightCtrl = new Thread(new Device("Light Controller", 4, 5));
        Thread doorLock = new Thread(new Device("Door Lock Monitor", 6, 5));

        tempSensor.start();
        securityCam.start();
        lightCtrl.start();
        doorLock.start();
    }
}
