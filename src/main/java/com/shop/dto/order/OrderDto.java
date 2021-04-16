package com.shop.dto.order;

import com.shop.model.customer.Customer;
import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class OrderDto {
    private String id;
    private Customer customer;
    private List<Product> products;
    private BigDecimal totalAmount;
    private boolean isPaid;
}
