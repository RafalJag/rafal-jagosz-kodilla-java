package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String args[]) {
        MailService mailService = new MailService();
        Product product = new Product("Przykładowy produkt");

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        OrderService orderService = new OrderService();

        extraFoodShop.addProduct(product, 100);
        glutenFreeShop.addProduct(product, 50);
        healthyShop.addProduct(product, 20);

        OrderRequest orderRequest = new OrderRequest(product, 90);

        orderService.process(orderRequest, extraFoodShop, mailService);
    }
}