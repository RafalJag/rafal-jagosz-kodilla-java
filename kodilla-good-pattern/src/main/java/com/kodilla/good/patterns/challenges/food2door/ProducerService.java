package com.kodilla.good.patterns.challenges.food2door;

public interface ProducerService {
    OrderDto process(OrderRequest orderRequest, InfoService informationService);

    String getProducerName();
}