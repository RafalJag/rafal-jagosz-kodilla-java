package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given

        int[] numbersTest = {1, 12, 23, 34, 45, 56, 67, 78, 89, 90, 110, 121, 132, 143, 154, 165, 176, 187, 198, 200 };

        //When

        double averageTest = ArrayOperations.getAverage(numbersTest);

        //Then

        assertEquals(104.05, averageTest);

    }
}