package com.gla.Generics_Collections.Collection;

import java.util.*;

class Team {
    String name;
    int points;
    Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String toString() {
        return name + " | " + points;
    }
}

class Match {
    Team t1;
    Team t2;
    Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public String toString() {
        return t1.name + " vs " + t2.name;
    }
}

class Result {
    String winner;
    Result(String winner) {
        this.winner = winner;
    }

    public String toString() {
        return winner;
    }
}

public class TournamentSystem {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>(
                (a, b) -> b.points - a.points);

        Team a = new Team("India", 0);
        Team b = new Team("Australia", 0);
        Team c = new Team("England", 0);

        teams.add(a);
        teams.add(b);
        teams.add(c);

        matches.add(new Match(a, b));
        matches.add(new Match(b, c));
        matches.add(new Match(a, c));

        System.out.println("Match Processing:");
        while (!matches.isEmpty()) {
            Match m = matches.remove();
            System.out.println("Playing: " + m);
            Team winner;

            if (m.t1.name.compareTo(m.t2.name) > 0) {
                winner = m.t1;
            }
            else {
                winner = m.t2;
            }

            winner.points += 2;
            results.add(new Result(winner.name));
            leaderboard.clear();
            leaderboard.addAll(teams);
        }

        System.out.println("\nMatch Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
