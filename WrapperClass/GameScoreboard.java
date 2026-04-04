package com.gla.WrapperClass;

public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {50, null, 70, null, 90};

        int notPlayed = 0;
        int total = 0;
        for(Integer score : scores) {
            if(score == null) {
                notPlayed++;
            }
            else{
                total += score;
            }
        }

        System.out.println("Players not played = " + notPlayed);
        System.out.println("Total score = " + total);
    }
}
