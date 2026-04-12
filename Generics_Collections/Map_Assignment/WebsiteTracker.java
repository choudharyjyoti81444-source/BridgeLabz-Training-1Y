package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class WebsiteTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] visits = {
                "home", "about", "products", "home",
                "products", "contact", "home"};

        for (int i = 0; i < visits.length; i++) {
            String page = visits[i];
            if (map.containsKey(page)) {
                map.put(page, map.get(page) + 1);
            }
            else {
                map.put(page, 1);
            }
        }

        List<String> pages = new ArrayList<>(map.keySet());
        Collections.sort(pages, (a, b) -> map.get(b) - map.get(a));
        System.out.println("Pages by popularity:");
        for (int i = 0; i < pages.size(); i++) {
            String key = pages.get(i);
            System.out.println(key + " = " + map.get(key));
        }

        String topPage = pages.get(0);
        System.out.println("\nMost Visited Page: " + topPage);
    }
}
