package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("driving", driving.getTaskName());
        assertFalse(driving.isExecuted());
        driving.executeTask();
        assertTrue(driving.isExecuted());
    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("painting", painting.getTaskName());
        assertFalse(painting.isExecuted());
        painting.executeTask();
        assertTrue(painting.isExecuted());
    }

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("shopping", shopping.getTaskName());
        assertFalse(shopping.isExecuted());
        shopping.executeTask();
        assertTrue(shopping.isExecuted());
    }
}