package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.LOG;
        //When
        logger.log("test_test_test");
        String log = logger.getLastLog();
        //Then
        assertEquals("test_test_test", log);
    }
}