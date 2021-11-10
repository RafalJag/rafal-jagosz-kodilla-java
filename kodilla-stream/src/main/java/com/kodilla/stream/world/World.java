package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set<Continent> world = new HashSet<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public void removeContinent(Continent continent) {
        world.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getpeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));}
}