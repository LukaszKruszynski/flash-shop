package com.shop.dto.product;

import com.shop.model.group.Group;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
public class ProductDto {
    private String id;
    private String name;
    private BigDecimal price;
    private Group group;
}
