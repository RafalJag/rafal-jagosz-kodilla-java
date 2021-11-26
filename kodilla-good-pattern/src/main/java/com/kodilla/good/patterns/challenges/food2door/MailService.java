package com.kodilla.good.patterns.challenges.food2door;

public class MailService implements InfoService {
    public void inform(OrderRequest orderRequest, boolean isOrdered, String producerName){
        if(isOrdered){
            System.out.println("Zamówienie: \n" + orderDetails(orderRequest, producerName) +"\nZłożone pomyślnie.");
        } else {
            System.out.println("\nWystąpił błąd w zamówieniu.");
        }
    }
    public String orderDetails(OrderRequest orderRequest, String producerName){
        String message = "Produkt: " + orderRequest.getProduct().getItem() + "\nIlość: " + orderRequest.getQuantity() + "\nDostawca: " + producerName;
        return message;
    }
}