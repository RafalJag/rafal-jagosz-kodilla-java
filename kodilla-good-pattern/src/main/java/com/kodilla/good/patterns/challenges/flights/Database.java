package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Database {

    Set<Flight> flights = new HashSet<>();

    public Database() {
        this.flights.add(new Flight("BERLIN", "PARYZ"));
        this.flights.add(new Flight("BERLIN", "WARSZAWA"));
        this.flights.add(new Flight("BERLIN", "LONDYN"));
        this.flights.add(new Flight("BERLIN", "RZYM"));
        this.flights.add(new Flight("WARSZAWA", "LONDYN"));
        this.flights.add(new Flight("WARSZAWA", "BERLIN"));
        this.flights.add(new Flight("WARSZAWA", "GDANSK"));
        this.flights.add(new Flight("WARSZAWA", "KRAKOW"));
        this.flights.add(new Flight("LONDYN", "WARSZAWA"));
        this.flights.add(new Flight("LONDYN", "BERLIN"));
        this.flights.add(new Flight("LONDYN", "KOPENHAGA"));
        this.flights.add(new Flight("LONDYN", "PARYZ"));
    }
}