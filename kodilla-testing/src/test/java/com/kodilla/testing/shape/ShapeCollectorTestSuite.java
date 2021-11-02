package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    class TestShapeCollector{
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(66, 6);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getGeometricFigures().size());
        }

        @Test
        void testRemoveFigureWhichDoesNotExist(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(6);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        public void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(6);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }

        @Test
        public void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(6, 66);
            shapeCollector.addFigure(shape);
            ArrayList<Shape> comparisonList= new ArrayList<>();
            comparisonList.add(shape);
            //When
            List<Shape> geometricFigures = shapeCollector.getGeometricFigures();
            //Then
            Assertions.assertEquals(comparisonList.toString(), geometricFigures.toString());
        }
    }
}