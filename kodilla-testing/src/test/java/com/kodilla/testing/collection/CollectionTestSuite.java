package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when sending empty list, " +
            "then exterminate() should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = test.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("when sending list with odd and even numbers, " +
            "then exterminate() should return only even numbers "
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        List<Integer> expectedlList = new ArrayList<>();
        expectedlList.add(2);
        expectedlList.add(4);
        expectedlList.add(6);
        //When
        List<Integer> result = test.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedlList, result);
    }
}


