package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<>();
        books.put("978-111", "Java Basics");
        books.put("978-222", "Data Structures");
        books.put("978-333", "Algorithms");
        String searchISBN = "978-222";
        if (books.containsKey(searchISBN)) {
            System.out.println("Book: " + books.get(searchISBN));
        }
        else {
            System.out.println("Book not found");
        }

        books.remove("978-111");
        TreeMap<String, String> sortedBooks = new TreeMap<>(books);
        System.out.println("\nAll Books (Sorted by ISBN):");
        for (String key : sortedBooks.keySet()) {
            System.out.println(key + " = " + sortedBooks.get(key));
        }

        String searchTitle = "Algorithms";
        boolean found = false;
        for (String key : books.keySet()) {
            if (books.get(key).equals(searchTitle)) {
                System.out.println("\nFound Title ISBN: " + key);
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nTitle not found");
        }
    }
}
