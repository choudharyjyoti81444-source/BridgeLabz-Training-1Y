package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;
public class EmailNotification {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com");

        emails.forEach(e -> sendEmailNotification(e));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }
}
