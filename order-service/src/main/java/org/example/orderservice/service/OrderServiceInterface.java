package org.example.orderservice.service;



import org.example.orderservice.dto.OrderRequest;
import org.example.orderservice.entities.Order;

import java.util.List;

public interface OrderServiceInterface {
    Order getOrder(long orderId);
    List<Order> getAllOrders();
    Order createOrder(OrderRequest order);
    void deleteOrder(long orderId);
}
