package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    public OrderDto process(OrderRequest orderRequest, ProducerService producerService, InfoService infoService){
        return producerService.process(orderRequest, infoService);
    }
}