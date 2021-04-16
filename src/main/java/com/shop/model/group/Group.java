package com.shop.model.group;

import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(value = "groups")
public class Group {
    @Id
    private String id;
    private String name;
    private List<Product> products;

    public Group(String name) {
        this.name = name;
    }
}
