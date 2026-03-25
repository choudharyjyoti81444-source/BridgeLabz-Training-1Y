package com.gla.Threads;
class Activity extends Thread {
    private String activityName;
    private int startDelay;

    public Activity(String name, int startDelay, int priority) {
        this.activityName = name;
        this.startDelay = startDelay;
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            if (startDelay > 0) Thread.sleep(startDelay * 1000);
            System.out.println(activityName + " started | State: " + getState());
            Thread.sleep(2000); // simulate duration
            System.out.println(activityName + " completed | State: " + getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ExamHall {
    public static void main(String[] args) {
        Activity entry = new Activity("Student Entry Monitoring", 0, 5);
        Activity questionPaper = new Activity("Question Paper Distribution", 5, 10);
        Activity attendance = new Activity("Attendance Marking", 10, 8);
        Activity collection = new Activity("Answer Sheet Collection", 15, 7);

        entry.start();
        questionPaper.start();
        attendance.start();
        collection.start();
    }
}
