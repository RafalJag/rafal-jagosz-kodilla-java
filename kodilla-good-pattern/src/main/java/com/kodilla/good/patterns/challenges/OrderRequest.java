package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;


public class OrderRequest{

    private User user;
    private Product product;
    public LocalDate orderDate;

    public OrderRequest( User user, Product product, LocalDate orderDate){
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public User getUser(){
        return user;
    }

    public Product getProduct(){
        return product;
    }

    public LocalDate getOrderDate(){
        return orderDate;
    }
}