package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        start();
        run();
        exitGame();
    }

    public static void start() {
        Scanner scan = new Scanner(System.in);
        Description start = new Description();
        System.out.println("Jak masz na imię?");
        String name = scan.nextLine();
        System.out.println("Cześć " + name + "\n" + start.getDescription());

    }

    public static void run() {
        int playerWins = 0;
        int computerWins = 0;
        boolean end = false;
        Description description = new Description();

        int rounds = description.roundsToWin();
        while (!end) {

            int playerMove = description.playerMove();
            int computerMove = new Random().nextInt(3) + 1;
            description.computerMove(computerMove);
            if (description.playerWin(playerMove, computerMove)) {
                playerWins++;
                System.out.println("Wygrałeś! ");
                System.out.println("Aktualny wynik: " + "Ty: " + playerWins + " Komputer: " + computerWins);
            } else if (playerMove == computerMove) {
                System.out.println("Remis!");
                System.out.println("Aktualny wynik: " + "Ty: " + playerWins + " Komputer: " + computerWins);
            } else {
                computerWins++;
                System.out.println("Przegrałeś!");
                System.out.println("Aktualny wynik: " + "Ty: " + playerWins + " Komputer: " + computerWins);
            }
            if (rounds == playerWins || rounds == computerWins) {
                System.out.println("KONIEC GRY\n" + "Wynik: " + playerWins + ":" + computerWins);
                exitGame();
            }
        }
    }

    public static void exitGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aby wyjść z gry wpisz: \"x\"\n" + "Aby zagrać jeszcze raz wpisz: \"n\"");
        String exitOrNew = scan.nextLine();
        if (exitOrNew.equals("x")) {
            System.exit(0);
        } else if (exitOrNew.equals("n")) {
            run();
        } else {
            System.out.println("Błędny znak:");
            exitGame();
        }
    }
}