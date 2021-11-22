package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);

    private static final String description = "OPIS KLAWISZY: \n" +
            "1 – zagranie \"KAMIEN\"\n" +
            "2 – zagranie \"PAPIER\"\n" +
            "3 – zagranie \"NOZYCE\"\n";

    public String getDescription() {
        return description;
    }

    public int playerMove() {
        int move = 0;
        String next;
        System.out.println("Wykonaj ruch");
        boolean ok = false;

        do {
            next = scan.next();
            try {
                move = Integer.parseInt(next);
                if ( move < 1 || move >3 ) {
                    System.out.println("Błędny znak. Wybierz między 1-3");
                } else {
                    ok = true;
                }
            } catch (Exception e) {
                        System.out.println("Błędny znak. Wybierz między 1-3");
                    }
                } while (!ok);

            if (move == Moves.ROCK.getNumber()) {
                System.out.println("Zagrałeś \"KAMIEN\"");
            } else if (move == Moves.PAPER.getNumber()) {
                System.out.println("Zagrałeś \"PAPIER\"");
            } else  {
                System.out.println("Zagrałeś \"NOZYCE\"" );
            }
        return move;
    }


    public void computerMove(int move) {
        if (move == Moves.ROCK.getNumber()) {
            System.out.println("Komputer zagrał \"KAMIEN\"");
        } else if (move == Moves.PAPER.getNumber()) {
            System.out.println("Komputer zagrał \"PAPIER\"");
        } else {
            System.out.println("Komputer zagrał \"NOZYCE\"");
        }
    }

    public static boolean playerWin(int playerMove, int computerMove) {
        int rock = Moves.ROCK.getNumber();
        int paper = Moves.PAPER.getNumber();
        int scissors = Moves.SCISSORS.getNumber();
        return (playerMove == rock && computerMove == scissors) || (playerMove == paper && computerMove == rock) ||
                (playerMove == scissors && computerMove == paper);
    }

    public int roundsToWin() {
        int rounds;
        do {
            System.out.println("Podaj liczbę rund potrzebnych do wygrania gry.");
            while (!scan.hasNextInt()) {
                System.out.println("Błędny znak. Podaj liczbe!");
                scan.next();
            }
            rounds = scan.nextInt();
        } while (rounds <= 0);
        return rounds;
    }
}