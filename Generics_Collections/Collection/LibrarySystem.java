package com.gla.Generics_Collections.Collection;

import java.util.*;

class Book {
    String title;
    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        addMember("M1", members);
        addMember("M2", members);
        addMember("M3", members);
        addMember("M1", members); // duplicate ignored

        addBook("Java", books, issueQueue);
        addBook("C++", books, issueQueue);
        addBook("Python", books, issueQueue);
        addBook("Java", books, issueQueue); // duplicate ignored

        System.out.println("Issuing Books:");

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.remove();
            System.out.println("Issued: " + b);
            returned.push(b); // simulate return
        }

        System.out.println("\nRe-issuing most recent:");
        if (!returned.isEmpty()) {
            Book b = returned.pop();
            System.out.println("Re-issued: " + b);
        }

        System.out.println("\nAll Books:");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\nMembers:");
        for (String m : members) {
            System.out.println(m);
        }
    }

    static void addBook(String title,
                        List<Book> list,
                        Queue<Book> queue) {

        for (Book b : list) {
            if (b.title.equals(title)) return; // duplicate check
        }

        Book b = new Book(title);
        list.add(b);
        queue.add(b);
    }

    static void addMember(String id, Set<String> set) {
        set.add(id); // auto handles duplicate
    }
}
