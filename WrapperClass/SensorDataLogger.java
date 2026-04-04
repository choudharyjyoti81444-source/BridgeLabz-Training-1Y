package com.gla.WrapperClass;

import java.util.ArrayList;
public class SensorDataLogger {
    static ArrayList<Double> data = new ArrayList<>();

    public static void addData(double value){
        data.add(value);
    }

    public static void addData(Double value){
        data.add(value);
    }

    public static void printData(){
        for (Double val : data) {
            double temp = val;
            System.out.println(temp);
        }
    }

    public static void main(String[] args){
        addData(25.5);
        addData(Double.valueOf(30.2));
        addData(28.7);

        printData();
    }
}
