package com.gla.Generics_Collections.Collection;

import java.util.*;

class Movie {
    String name;
    String genre;
    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " | " + genre;
    }
}
public class StreamingSystem {
    public static void main(String[] args) {
        List<Movie> allMovies = new ArrayList<>();
        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Interstellar", "SciFi"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Batman", "Action"));

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));

        System.out.println("Watching Movies:");
        while (!upNext.isEmpty()) {
            Movie m = upNext.remove();
            System.out.println("Watching: " + m);
            history.push(m);
            genres.add(m.genre);
        }

        System.out.println("\nWatch History:");
        for (Movie m : history) {
            System.out.println(m);
        }

        System.out.println("\nGenres Watched:");
        for (String g : genres) {
            System.out.println(g);
        }

        System.out.println("\nRecommendations:");
        for (Movie m : allMovies) {
            if (genres.contains(m.genre)) {
                System.out.println("Recommended: " + m.name);
            }
        }
    }
}
