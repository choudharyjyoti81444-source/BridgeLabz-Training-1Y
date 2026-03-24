package com.gla.Class_Practice.Threads;

public class MyThread implements Runnable{
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("Number : "+i);
        }
    }
    public static void main(String[] args){
        MyThread t2 = new MyThread();
        // t1.start();   //yhh thread nhi h isliye start nhi hoga thats why error show ho rh
        Thread tt2 = new Thread(t2);
        tt2.start();
    }
}
