package com.shop.mapper.order;

import com.shop.dto.order.OrderDetailsDto;
import com.shop.dto.order.OrderDto;
import com.shop.dto.order.ShippingDetailsDto;
import com.shop.mapper.customer.CustomerMapper;
import com.shop.mapper.product.ProductMapper;
import com.shop.model.order.Order;
import com.shop.model.order.OrderDetails;
import com.shop.model.order.ShippingDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private final ProductMapper productMapper;
    private final CustomerMapper customerMapper;

    public OrderDto mapToOrderDto(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .customer(customerMapper.mapToCustomerDto(order.getCustomer()))
                .orderDetails(mapToOrderDetailsDto(order.getOrderDetails()))
                .products(productMapper.mapToProductDtos(order.getProducts()))
                .totalAmount(order.getTotalAmount())
                .build();
    }

    public List<OrderDto> mapToOrderDtos(List<Order> orders) {
        return orders.stream()
                .map(this::mapToOrderDto)
                .collect(Collectors.toList());
    }
    public Order mapToOrder(OrderDto orderDto) {
        return Order.builder()
                .id(orderDto.getId())
                .orderDetails(mapToOrderDetails(orderDto.getOrderDetails()))
                .customer(customerMapper.mapToCustomer(orderDto.getCustomer()))
                .products(productMapper.mapToProducts(orderDto.getProducts()))
                .totalAmount(orderDto.getTotalAmount())
                .build();
    }

    private OrderDetailsDto mapToOrderDetailsDto(OrderDetails orderDetails) {
        return OrderDetailsDto.builder()
                .shippingDetails(mapToShippingDetailsDto(orderDetails.getShippingDetails()))
                .isPaid(orderDetails.isPaid())
                .isSend(orderDetails.isSend())
                .build();
    }

    private ShippingDetailsDto mapToShippingDetailsDto(ShippingDetails shippingDetails) {
        return ShippingDetailsDto.builder()
                .deliverCompany(shippingDetails.getDeliverCompany())
                .shipmentNumber(shippingDetails.getShipmentNumber())
                .webLink(shippingDetails.getWebLink())
                .build();
    }

    private OrderDetails mapToOrderDetails(OrderDetailsDto orderDetails) {
        return OrderDetails.builder()
                .shippingDetails(mapToShippingDetails(orderDetails.getShippingDetails()))
                .isPaid(orderDetails.isPaid())
                .isSend(orderDetails.isSend())
                .build();
    }

    private ShippingDetails mapToShippingDetails(ShippingDetailsDto shippingDetails) {
        return ShippingDetails.builder()
                .deliverCompany(shippingDetails.getDeliverCompany())
                .shipmentNumber(shippingDetails.getShipmentNumber())
                .webLink(shippingDetails.getWebLink())
                .build();
    }
}
