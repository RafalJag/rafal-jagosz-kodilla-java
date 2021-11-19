package com.kodilla.rps;

public enum Moves {
    ROCK (1),
    PAPER (2),
    SCISSORS (3);

    private final int number;

    Moves (int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}