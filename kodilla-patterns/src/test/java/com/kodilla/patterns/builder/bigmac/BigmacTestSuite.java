package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("standard")
                .sauce("barbecue")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("ser")
                .ingredient("ogorek")
                .ingredient("papryczki chilli ")
                .burgers(1)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(5, howManyIngredients);
    }
}