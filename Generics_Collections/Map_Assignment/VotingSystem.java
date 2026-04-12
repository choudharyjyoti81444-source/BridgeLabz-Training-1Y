package com.gla.Generics_Collections.Map_Assignment;
import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> votes = new HashMap<>();
        String[] castVotes = {
                "Aman", "Riya", "Aman", "Neha", "Aman",
                "Riya", "Neha", "Neha", "Aman", "Riya"
        };

        for (int i = 0; i < castVotes.length; i++) {
            String name = castVotes[i];
            if (votes.containsKey(name)) {
                votes.put(name, votes.get(name) + 1);
            }
            else {
                votes.put(name, 1);
            }
        }

        System.out.println("Vote Count:");
        for (String key : votes.keySet()) {
            System.out.println(key + " = " + votes.get(key));
        }

        String maxCandidate = "";
        int maxVotes = 0;
        for (String key : votes.keySet()) {
            if (votes.get(key) > maxVotes) {
                maxVotes = votes.get(key);
                maxCandidate = key;
            }
        }

        System.out.println("\nWinner: " + maxCandidate + " (" + maxVotes + " votes)");
    }
}
