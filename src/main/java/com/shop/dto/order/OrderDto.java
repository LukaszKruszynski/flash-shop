package com.shop.dto.order;

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
    private OrderCustomerDetailsDto orderCustomerDetailsDto;
    private List<ProductDto> products;
    private BigDecimal totalAmount;
    private OrderDetailsDto orderDetails;

}
