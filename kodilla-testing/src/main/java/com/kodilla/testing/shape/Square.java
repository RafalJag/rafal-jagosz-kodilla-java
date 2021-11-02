package com.kodilla.testing.shape;

public class Square implements Shape {

    private static String name = "Square";
    double squareEdge;

    public Square(double squareSide) {
        this.squareEdge = squareSide;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = squareEdge * squareEdge ;
        return field;
    }
}