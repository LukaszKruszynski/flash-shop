package com.shop.mapper.order;

import com.shop.dto.order.*;
import com.shop.mapper.product.ProductMapper;
import com.shop.model.order.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private final ProductMapper productMapper;

    public OrderDto mapToOrderDto(Order order) {
        return OrderDto.builder()
                .id(order.getId())
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
                .products(productMapper.mapToProducts(orderDto.getProducts()))
                .totalAmount(orderDto.getTotalAmount())
                .build();
    }

    private OrderDetailsDto mapToOrderDetailsDto(OrderDetails orderDetails) {
        return OrderDetailsDto.builder()
                .orderCustomerDetailsDto(mapToOrderCustomerDetailsDto(orderDetails.getOrderCustomerDetails()))
                .shippingDetails(mapToShippingDetailsDto(orderDetails.getShippingDetails()))
                .isPaid(orderDetails.isPaid())
                .isSend(orderDetails.isSend())
                .build();
    }

    private OrderCustomerDetailsDto mapToOrderCustomerDetailsDto(OrderCustomerDetails orderCustomerDetails) {
        return OrderCustomerDetailsDto.builder()
                .customerId(orderCustomerDetails.getCustomerId())
                .firstName(orderCustomerDetails.getFirstName())
                .lastName(orderCustomerDetails.getLastName())
                .mail(orderCustomerDetails.getMail())
                .phone(orderCustomerDetails.getPhone())
                .build();

    }

    private ShippingDetailsDto mapToShippingDetailsDto(ShippingDetails shippingDetails) {
        return ShippingDetailsDto.builder()
                .orderDeliveryAddress(mapToOrderDeliveryAddressDto(shippingDetails.getOrderDeliveryAddress()))
                .deliverCompany(shippingDetails.getDeliverCompany())
                .shipmentNumber(shippingDetails.getShipmentNumber())
                .webLink(shippingDetails.getWebLink())
                .build();
    }

    private OrderDeliveryAddressDto mapToOrderDeliveryAddressDto(OrderDeliveryAddress orderDeliveryAddress) {
        return OrderDeliveryAddressDto.builder()
                .address(orderDeliveryAddress.getAddress())
                .city(orderDeliveryAddress.getCity())
                .postCode(orderDeliveryAddress.getPostCode())
                .street(orderDeliveryAddress.getStreet())
                .build();
    }

    private OrderDetails mapToOrderDetails(OrderDetailsDto orderDetails) {
        return OrderDetails.builder()
                .orderCustomerDetails(mapToOrderCustomerDetails(orderDetails.getOrderCustomerDetailsDto()))
                .shippingDetails(mapToShippingDetails(orderDetails.getShippingDetails()))
                .isPaid(orderDetails.isPaid())
                .isSend(orderDetails.isSend())
                .build();
    }

    private OrderCustomerDetails mapToOrderCustomerDetails(OrderCustomerDetailsDto orderCustomerDetailsDto) {
        return OrderCustomerDetails.builder()
                .customerId(orderCustomerDetailsDto.getCustomerId())
                .firstName(orderCustomerDetailsDto.getFirstName())
                .lastName(orderCustomerDetailsDto.getLastName())
                .mail(orderCustomerDetailsDto.getMail())
                .phone(orderCustomerDetailsDto.getPhone())
                .build();
    }

    private ShippingDetails mapToShippingDetails(ShippingDetailsDto shippingDetails) {
        return ShippingDetails.builder()
                .orderDeliveryAddress(mapToOrderDeliveryAddress(shippingDetails.getOrderDeliveryAddress()))
                .deliverCompany(shippingDetails.getDeliverCompany())
                .shipmentNumber(shippingDetails.getShipmentNumber())
                .webLink(shippingDetails.getWebLink())
                .build();
    }

    private OrderDeliveryAddress mapToOrderDeliveryAddress(OrderDeliveryAddressDto orderDeliveryAddress) {
        return OrderDeliveryAddress.builder()
                .address(orderDeliveryAddress.getAddress())
                .city(orderDeliveryAddress.getCity())
                .postCode(orderDeliveryAddress.getPostCode())
                .street(orderDeliveryAddress.getStreet())
                .build();
    }
}
