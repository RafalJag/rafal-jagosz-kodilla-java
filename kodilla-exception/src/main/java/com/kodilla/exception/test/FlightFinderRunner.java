package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Warszawa", "Londyn");
        Flight flight2 = new Flight("Berlin", "Warszawa");


        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}