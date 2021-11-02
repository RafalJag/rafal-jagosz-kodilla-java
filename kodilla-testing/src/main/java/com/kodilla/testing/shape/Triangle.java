package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private static String name = "Triangle";
    private double triangleEdge;
    private double triangleHeight;

    public Triangle(double triangleEdge, double triangleHeight) {
        this.triangleEdge = triangleEdge;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = triangleEdge * triangleHeight / 2 ;
        return field;
    }
}