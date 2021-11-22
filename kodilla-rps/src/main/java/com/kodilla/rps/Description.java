package com.kodilla.rps;

import java.util.Scanner;

public class Description {
    Scanner scan = new Scanner(System.in);

    private static final String description = "OPIS KLAWISZY: \n" +
            "1 – zagranie \"KAMIEN\"\n" +
            "2 – zagranie \"PAPIER\"\n" +
            "3 – zagranie \"NOZYCE\"\n";

    public String getDescription() {
        return description;
    }

    public int playerMove() {
        int move;
        //do {
            System.out.println("Wykonaj ruch");

            while (!scan.hasNextInt() ){//|| (scan.nextInt()>0 && scan.nextInt() <= 3) ) {
                System.out.println("Błędny znak. Wybierz między 1-3");
                scan.next();
            }
            move = scan.nextInt();

            while (move != 1 && move != 2 && move != 3) {
                System.out.println("Błędny znak. Wybierz między 1-3");
                move = scan.nextInt();
            }

            if (move == Moves.ROCK.getNumber()) {
                System.out.println("Zagrałeś \"KAMIEN\"");
            } else if (move == Moves.PAPER.getNumber()) {
                System.out.println("Zagrałeś \"PAPIER\"");
            } else  {
                System.out.println("Zagrałeś \"NOZYCE\"" );
            }
        //}
        //while (move <= 0) ;
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