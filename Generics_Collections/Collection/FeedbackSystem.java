package com.gla.Generics_Collections.Collection;

import java.util.*;
public class FeedbackSystem {
    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        Set<String> uniqueFeedback = new HashSet<>();
        Queue<String> processQueue = new LinkedList<>();
        Stack<String> recentStack = new Stack<>();

        addFeedback("Good service", allFeedback, uniqueFeedback, processQueue, recentStack);
        addFeedback("Bad experience", allFeedback, uniqueFeedback, processQueue, recentStack);
        addFeedback("Good service", allFeedback, uniqueFeedback, processQueue, recentStack); // duplicate
        addFeedback("Fast delivery", allFeedback, uniqueFeedback, processQueue, recentStack);

        System.out.println("Processing Feedback:");
        while (!processQueue.isEmpty()) {
            String fb = processQueue.remove();
            System.out.println("Processed: " + fb);
        }

        System.out.println("\nRecent Feedback (Stack):");
        int count = 0;
        while (!recentStack.isEmpty() && count < 3) {
            System.out.println(recentStack.pop());
            count++;
        }
    }

    static void addFeedback(String msg,
                            List<String> list,
                            Set<String> set,
                            Queue<String> queue,
                            Stack<String> stack) {

        list.add(msg);
        if (set.add(msg)) {
            queue.add(msg);
        }

        stack.push(msg);
    }
}
