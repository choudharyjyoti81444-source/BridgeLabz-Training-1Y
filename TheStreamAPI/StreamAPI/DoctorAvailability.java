package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;

class Doctor {
    String name;
    String day;
    String type;

    Doctor(String name, String day, String type) {
        this.name = name;
        this.day = day;
        this.type = type;
    }
}
public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> list = Arrays.asList(
                new Doctor("A", "Sunday", "Cardio"),
                new Doctor("B", "Monday", "Neuro"),
                new Doctor("C", "Saturday", "Ortho")
        );

        list.stream()
                .filter(d -> d.day.equals("Saturday") || d.day.equals("Sunday"))
                .sorted((a,b) -> a.type.compareTo(b.type))
                .forEach(d -> System.out.println(d.name));
    }

}
