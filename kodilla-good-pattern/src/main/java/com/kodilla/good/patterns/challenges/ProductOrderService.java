package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService{

    public boolean order(final User user, final Product product, final LocalDate orderDate) {
        System.out.println("Zamówienie dla: " + user.getFirstName()+ " " + user.getLastName() +
                ". Produkt: " + product.getProductName() +
                ". Data zamówienia: " + orderDate.toString());
        return true;
    }
}