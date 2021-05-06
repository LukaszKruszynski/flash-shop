package com.shop.service.order;

import com.shop.model.order.Order;
import com.shop.repository.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getOrders() {
        return repository.findAll();
    }
    public List<Order> getOrdersByCustomerId(String customerId) {
        return this.getOrders().stream()
                .filter(order -> order.getCustomer().getId().equals(customerId))
                .collect(Collectors.toList());
    }
}
