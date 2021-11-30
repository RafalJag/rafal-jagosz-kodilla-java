package com.kodilla.good.patterns.challenges.food2door;

public interface InfoService {
    void inform(OrderRequest orderRequest, boolean isOrdered, String producerName);
}