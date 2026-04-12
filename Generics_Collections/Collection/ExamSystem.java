package com.gla.Generics_Collections.Collection;

import java.util.*;

class Question {
    String q;

    Question(String q) {
        this.q = q;
    }

    public String toString() {
        return q;
    }
}

class Student {
    String id;
    Student(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}
public class ExamSystem {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is Java?"));
        questions.add(new Question("What is OOP?"));
        questions.add(new Question("What is Collection?"));

        Collections.shuffle(questions);
        Set<String> studentSet = new HashSet<>();

        studentSet.add("S1");
        studentSet.add("S2");
        studentSet.add("S3");
        studentSet.add("S1"); // duplicate ignored

        Queue<Student> queue = new LinkedList<>();
        for (String id : studentSet) {
            queue.add(new Student(id));
        }

        Stack<Question> stack = new Stack<>();
        System.out.println("Exam Start:");

        while (!queue.isEmpty()) {
            Student s = queue.remove();
            System.out.println("\nStudent: " + s);

            for (Question q : questions) {
                System.out.println("Question: " + q);
                stack.push(q);
                System.out.println("Back Function: " + stack.peek());
            }
        }

        System.out.println("\nAll students finished exam.");
    }
}
