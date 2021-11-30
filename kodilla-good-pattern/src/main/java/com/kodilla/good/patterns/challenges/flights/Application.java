package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main(String[] args) {
        SearchService searchService = new SearchService();
        System.out.println("Wszystkie loty:");
        searchService.getFlights();
        System.out.println("\nLoty z:");
        searchService.FindFlightFrom("LONDYN");
        System.out.println("\nLoty do:");
        searchService.FindFlightTo("WARSZAWA");
        System.out.println("\nLoty z przesiadką:");
        searchService.FindFlightWithTransfer("WARSZAWA", "PARYZ");
    }
}