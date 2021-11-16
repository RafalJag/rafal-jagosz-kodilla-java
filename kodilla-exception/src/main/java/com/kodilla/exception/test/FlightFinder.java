package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> availableFlights = new HashMap<>();
        availableFlights.put("Warszawa", true);
        availableFlights.put("Berlin", false);
        availableFlights.put("Londyn", true);

        for (Map.Entry<String, Boolean> available : availableFlights.entrySet()) {
            if (available.getKey().equals(flight.getDepartureAirport())) {
                if (available.getValue()) {
                    System.out.println("Lot z " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport() + " jest dostępny.");
                } else {
                    throw new RouteNotFoundException("Lot z " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport() + " nie jest dostępny.");
                }
            }
        }
    }
}