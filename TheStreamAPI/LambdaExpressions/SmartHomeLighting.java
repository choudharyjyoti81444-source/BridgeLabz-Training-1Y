package com.gla.TheStreamAPI.LambdaExpressions;

interface LightAction {
    void run();
}
public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Light ON");
        LightAction night = () -> System.out.println("Dim Light");
        LightAction voice = () -> System.out.println("Party Light");

        motion.run();
        night.run();
        voice.run();
    }
}
