package com.shop.dto.order;

import com.shop.dto.customer.CustomerDto;
import com.shop.dto.product.ProductDto;
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
    private CustomerDto customer;
    private List<ProductDto> products;
    private BigDecimal totalAmount;
    private OrderDetailsDto orderDetails;

}
