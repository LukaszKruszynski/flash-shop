package com.shop.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String description;
    private String name;
    private BigDecimal price;
}
