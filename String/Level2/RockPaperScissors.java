package com.gla.String.Level2;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) {
            return "Rock";
        } else if (rand < 0.66) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        double drawPercent = (draws * 100.0) / totalGames;

        String[][] stats = {
                {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
                {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)},
                {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)}
        };

        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Result\t\tCount\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors) for game " + (i + 1) + ": ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        displayResults(gameResults, stats);
    }

}
