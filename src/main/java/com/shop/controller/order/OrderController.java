package com.shop.controller.order;

import com.shop.dto.order.OrderDto;
import com.shop.mapper.order.OrderMapper;
import com.shop.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderController {
    private final OrderService service;
    private final OrderMapper mapper;

    @GetMapping
    public List<OrderDto> getOrders() {
        return mapper.mapToOrderDtos(service.getOrders());
    }
    @GetMapping("/customer/{customerId}")
    public List<OrderDto> getOrdersByCustomer(@PathVariable String customerId) {
        return mapper.mapToOrderDtos(service.getOrdersByCustomerId(customerId));
    }
    @PostMapping("/create")
    public void createOrder(@RequestBody OrderDto orderDto) {
        service.saveOrder(mapper.mapToOrder(orderDto));
    }
    @PutMapping("/update")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return mapper.mapToOrderDto(service.saveOrder(mapper.mapToOrder(orderDto)));
    }


}
