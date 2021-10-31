package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addAToB() {
        int result;
        result = a + b;
        return result;
    }

    public int subtractAFromB() {
        int result;
        result = b - a;
        return result;
    }
}