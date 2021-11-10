package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        Continent africa = new Continent();
        africa.addCountry(new Country("Nigeria", new BigDecimal("206139589")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("114963588")));
        africa.addCountry(new Country("Egypt", new BigDecimal("102334404")));

        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("1439323776")));
        asia.addCountry(new Country("India", new BigDecimal("1380004385")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("273523615")));

        Continent europe = new Continent();
        europe.addCountry( new Country("Russia", new BigDecimal("145934462")));
        europe.addCountry(new Country("Germany", new BigDecimal("83783942")));
        europe.addCountry(new Country("United Kingdom", new BigDecimal("67886011")));

        World continents = new World();
        continents.addContinent(africa);
        continents.addContinent(asia);
        continents.addContinent(europe);

        //When
        BigDecimal peopleQuantity = continents.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("3813893772"), peopleQuantity);
    }
}