package com.kodilla.good.patterns.challenges;

public class Product{

    private String productName;
    private double productPrice;

    public Product(final String productName, final double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return productName;
    }

    public double getProductPrice(){
        return productPrice;
    }
}