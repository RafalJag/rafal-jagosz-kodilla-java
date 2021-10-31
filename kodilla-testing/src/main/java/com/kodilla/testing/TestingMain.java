package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,10);

        int result1 = calculator.addAToB();
        int result2 = calculator.subtractAFromB();

        if (result1 == calculator.getA() + calculator.getB()) {
            System.out.println("addAToB: test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == calculator.getB() - calculator.getA()) {
            System.out.println("subtractAFromB: test OK");
        } else {
            System.out.println("Error!");
        }
    }
}