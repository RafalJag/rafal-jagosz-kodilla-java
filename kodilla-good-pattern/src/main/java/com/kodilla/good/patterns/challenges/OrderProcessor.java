package com.kodilla.good.patterns.challenges;

public class OrderProcessor{

    private MailService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final MailService informationService, final ProductOrderService productOrderService,
                           final OrderRepository orderRepository){
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = productOrderService.order(orderRequest.getUser(),
                orderRequest.getProduct(),
                orderRequest.getOrderDate());

        if (isOrdered){
            informationService.sendMsg(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getProduct(),
                    orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}