package com.shop.dto.group;

import com.shop.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class GroupDto {
    private String id;
    private String name;
    private List<Product> products;

    public GroupDto(String name) {
        this.name = name;
    }
}
