package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class HealthyShop implements ProducerService {

    private HashMap<Product, Integer> products = new HashMap<>();


    public OrderDto process(OrderRequest orderRequest, InfoService infoService){

        if(!products.containsKey(orderRequest.getProduct())){
            return new OrderDto(orderRequest, false);
        }
        boolean isOrdered = orderRequest.getQuantity() <= products.get(orderRequest.getProduct());
        infoService.inform(orderRequest, isOrdered, getProducerName());

        return new OrderDto(orderRequest, isOrdered);
    }

    public String getProducerName() {
        return "HealthyShop";
    }

    public void addProduct(Product product, Integer amount){
        products.put(product, amount);
    }
}