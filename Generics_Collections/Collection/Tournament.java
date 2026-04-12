package com.gla.Generics_Collections.Collection;

import java.util.*;

class Player {
    String name;
    Player(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Game {
    Player p1;
    Player p2;

    Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return p1 + " vs " + p2;
    }
}

class Results {
    String winner;

    Results(String winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Winner: " + winner;
    }
}

class Score {
    String player;
    int points;

    Score(String player, int points) {
        this.player = player;
        this.points = points;
    }

    public String toString() {
        return player + " = " + points;
    }
}
public class Tournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();

        players.add(new Player("Aman"));
        players.add(new Player("Riya"));
        players.add(new Player("Neha"));
        players.add(new Player("Aman")); // duplicate ignored

        Queue<Game> games = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>(
                (a, b) -> {
                    if (b.points == a.points)
                        return a.player.compareTo(b.player);
                    return b.points - a.points;
                }
        );

        List<Player> pList = new ArrayList<>(players);

        games.add(new Game(pList.get(0), pList.get(1)));
        games.add(new Game(pList.get(1), pList.get(2)));

        System.out.println("Game Processing:\n");

        while (!games.isEmpty()) {
            Game g = games.remove();
            System.out.println("Playing: " + g);
            String winner = g.p1.name; // simple logic
            results.add(new Result(winner));
            leaderboard.add(new Score(winner, 10));
        }

        System.out.println("\nResults:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}