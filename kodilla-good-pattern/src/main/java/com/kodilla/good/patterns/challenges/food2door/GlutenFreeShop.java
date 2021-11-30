package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class GlutenFreeShop implements ProducerService {

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
        return "GlutenFreeShop";
    }

    public void addProduct(Product product, Integer amount){
        products.put(product, amount);
    }
}