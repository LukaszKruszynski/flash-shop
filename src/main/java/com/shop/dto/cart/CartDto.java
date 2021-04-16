package com.shop.dto.cart;

import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
public class CartDto {
    private String id;
    private List<Product> products;
}
