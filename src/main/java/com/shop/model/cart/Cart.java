package com.shop.model.cart;

import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(value = "carts")
public class Cart {
    @Id
    private String id;
    private List<Product> products;
}
