package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //given
        double a = 12;
        double b = 4;

        //when
        double add = calculator.add(a,b);
        double sub = calculator.sub(a,b);
        double mul = calculator.mul(a,b);
        double div = calculator.div(a,b);

        //then
        assertEquals(16,add);
        assertEquals(8,sub);
        assertEquals(48,mul);
        assertEquals(3,div);
    }
}