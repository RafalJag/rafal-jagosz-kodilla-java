package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Database {

    public static Set<Flight> getDatabase() {

        Set<Flight> flights = new HashSet<>();

        flights.add(new Flight("BERLIN", "PARYZ"));
        flights.add(new Flight("BERLIN", "WARSZAWA"));
        flights.add(new Flight("BERLIN", "LONDYN"));
        flights.add(new Flight("BERLIN", "RZYM"));
        flights.add(new Flight("WARSZAWA", "LONDYN"));
        flights.add(new Flight("WARSZAWA", "BERLIN"));
        flights.add(new Flight("WARSZAWA", "GDANSK"));
        flights.add(new Flight("WARSZAWA", "KRAKOW"));
        flights.add(new Flight("LONDYN", "WARSZAWA"));
        flights.add(new Flight("LONDYN", "BERLIN"));
        flights.add(new Flight("LONDYN", "KOPENHAGA"));
        flights.add(new Flight("LONDYN", "PARYZ"));

        return new HashSet<>(flights);
    }
}