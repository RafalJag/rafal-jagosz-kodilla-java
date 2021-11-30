package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchService {

    Set<Flight> flights = Database.getDatabase();

    public void getFlights(){
        flights.stream()
                .map(Flight::toString)
                .forEach(System.out::println);
    }
    public void FindFlightFrom(String city){
        flights.stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(city))
                .map(Flight::toString)
                .forEach(System.out::println);
    }
    public void FindFlightTo(String city){
        flights.stream()
                .filter(flight -> flight.getArrival().equalsIgnoreCase(city))
                .map(Flight::toString)
                .forEach(System.out::println);
    }
    public void FindFlightWithTransfer(String start, String end) {
        List<Flight> flightStart = flights.stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(start))
                .collect(Collectors.toList());
        List<Flight> flightEnd = flights.stream()
                .filter(flight -> flight.getArrival().equalsIgnoreCase(end))
                .collect(Collectors.toList());
        for(Flight first: flightStart){
            for(Flight second: flightEnd){
                if(first.getArrival().equals(second.getDeparture())){
                    System.out.println(first);
                    System.out.println(second);
                }
            }
        }
    }
}