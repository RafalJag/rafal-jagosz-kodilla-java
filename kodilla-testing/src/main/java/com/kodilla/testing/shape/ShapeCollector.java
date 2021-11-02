package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> geometricFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        geometricFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return geometricFigures.remove(shape);
    }

    public Shape getFigure(int shapeNumber){
        if(shapeNumber >= 0 && shapeNumber < geometricFigures.size()){
            return geometricFigures.get(shapeNumber);
        } else {
            return null;
        }

    }

    public void showFigures(){
        System.out.println(geometricFigures.toString());
    }

    public List<Shape> getGeometricFigures() {
        return geometricFigures;
    }

}