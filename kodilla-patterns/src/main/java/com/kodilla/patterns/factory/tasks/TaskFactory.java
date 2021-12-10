package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(String shapeClass){
        switch (shapeClass){
            case DRIVING:
                return new DrivingTask("driving", "Warsaw", "Taxi");
            case PAINTING:
                return new PaintingTask("painting", "White", "The wall");
            case SHOPPING:
                return new ShoppingTask("shopping", "Shoes", 2);
            default:
                return null;
        }
    }
}