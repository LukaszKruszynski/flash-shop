package com.shop;

import com.shop.dto.order.OrderDto;
import com.shop.model.order.*;
import com.shop.model.product.Product;
import com.shop.service.order.OrderService;
import com.shop.service.product.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class FlashShopApplicationTests {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Test
    void contextLoads() {
    }

    @Test
    void createOrder() {
        OrderDeliveryAddress address = OrderDeliveryAddress.builder()
                .street("Poreby")
                .city("Poreby")
                .postCode("97-400")
                .address("50A")
                .build();

        ShippingDetails dhl = ShippingDetails.builder()
                .orderDeliveryAddress(address)
                .deliverCompany("DHL")
                .shipmentNumber("83743828")
                .webLink("www.dhl.pl/sledz-paczke")
                .build();
        OrderCustomerDetails customer = OrderCustomerDetails.builder()
                .mail("DobryMail@gmail.com")
                .phone("796-654-321")
                .lastName("Mistrzu")
                .firstName("Marek")
                .build();

        OrderDetails orderDetails = OrderDetails.builder()
                .shippingDetails(dhl)
                .isPaid(true)
                .isSend(true)
                .orderCustomerDetails(customer)
                .build();


        Order order = Order.builder()
                .products(productService.getProducts())
                .orderDetails(orderDetails)
                .totalAmount(productService.getProducts().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add))
                .build();

    }
}
