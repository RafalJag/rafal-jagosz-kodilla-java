package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetrieve{

    public OrderRequest retrieve(){

        User user = new User("Example", "User");

        Product product = new Product("Product1", 99.99);

        LocalDate orderDate = LocalDate.of(2021, 11, 26);

        return new OrderRequest(user, product, orderDate);
    }
}