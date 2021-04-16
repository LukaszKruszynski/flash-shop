package com.shop.service.order;

import com.shop.model.order.Order;
import com.shop.repository.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public void deleteOrder(Order order) {
        repository.delete(order);
    }
}
