package com.gla.TheStreamAPI.LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String msg;
    String type;

    Alert(String msg, String type) {
        this.msg = msg;
        this.type = type;
    }
}
public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> list = new ArrayList<>();
        list.add(new Alert("High BP", "CRITICAL"));
        list.add(new Alert("Reminder", "INFO"));

        Predicate<Alert> check = a -> a.type.equals("CRITICAL");

        for (Alert a : list) {
            if (check.test(a)) {
                System.out.println(a.msg);
            }
        }
    }
}
