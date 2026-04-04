package com.gla.WrapperClass;

import java.util.ArrayList;
public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for(Object obj : inputs) {
            if(obj == null) continue;

            if(obj instanceof Integer) {
                validMarks.add((Integer) obj);
            }
            else if(obj instanceof String) {
                String str = (String) obj;
                if (str.equalsIgnoreCase("null")) continue;

                try{
                    validMarks.add(Integer.parseInt(str));
                }
                catch(NumberFormatException e) {
                }
            }
        }

        int sum = 0;
        for (int mark : validMarks) {
            sum += mark;
        }

        double avg = validMarks.size() == 0 ? 0 : (double) sum / validMarks.size();
        System.out.println("Average marks = " + avg);
    }
}
