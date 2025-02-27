package org.example.orderservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.orderservice.dto.OrderRequest;
import org.example.orderservice.entities.Order;
import org.example.orderservice.repository.OrderRepo;
import org.example.orderservice.service.OrderServiceInterface;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServiceInterface {
    private final OrderRepo orderRepo;
    @Override
    public Order getOrder(long orderId) {
        Order order = orderRepo.findById(orderId).orElseThrow(()-> new RuntimeException("no order found with id: " + orderId));
        return order;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = orderRepo.findAll();
        return orders;
    }

    @Override
    public Order createOrder(OrderRequest orderRequest) {
        Order order = Order.builder()
                .productIds(orderRequest.getProductIds())
                .price(orderRequest.getPrice())
                .build();
        orderRepo.save(order);
        return order;
    }

    @Override
    public void deleteOrder(long orderId) {
        orderRepo.deleteById(orderId);

    }
}
