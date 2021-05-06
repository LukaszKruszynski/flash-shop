package com.shop.model.order;

import com.shop.model.customer.Customer;
import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Document(value = "orders")
public class Order {
    @Id
    private String id;
    private Customer customer;
    private List<Product> products;
    private BigDecimal totalAmount;
    private OrderDetails orderDetails;
}
