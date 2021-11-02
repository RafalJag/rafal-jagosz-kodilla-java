package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double circleRadius;
    private static String name = "Circle";

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = circleRadius * circleRadius * 3.14;
        return field;
    }
}