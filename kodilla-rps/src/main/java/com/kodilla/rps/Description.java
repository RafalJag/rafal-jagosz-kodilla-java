package com.kodilla.rps;

import java.util.Scanner;

public class Description {
    RpsRunner error = new RpsRunner();
    Scanner check = new Scanner(System.in);

    private static final String description = "OPIS KLAWISZY: \n" +
            "1 – zagranie \"KAMIEN\"\n" +
            "2 – zagranie \"PAPIER\"\n" +
            "3 – zagranie \"NOZYCE\"\n";

    public String getDescription() {
        return description;
    }

    public void playerMove(int move) {
        if (move == Moves.ROCK.getNumber()) {
            System.out.println("Zagrałeś \"KAMIEN\"");
        } else if (move == Moves.PAPER.getNumber()) {
            System.out.println("Zagrałeś \"PAPIER\"");
        } else if (move == Moves.SCISSORS.getNumber()) {
            System.out.println("Zagrałeś \"NOZYCE\"" );
        } else {
            System.out.println("Błąd, podaj cyfre 1 - 3");
            error.run();
        }
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

    public static boolean playerWin (int playerMove, int computerMove){
        int rock = Moves.ROCK.getNumber();
        int paper = Moves.PAPER.getNumber();
        int scissors = Moves.SCISSORS.getNumber();
        return (playerMove == rock && computerMove == scissors) || (playerMove == paper && computerMove == rock) ||
                (playerMove == scissors && computerMove == paper);
    }
}