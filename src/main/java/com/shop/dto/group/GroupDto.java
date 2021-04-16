package com.shop.dto.group;

import com.shop.dto.product.ProductDto;
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
    private List<ProductDto> productsDto;

    public GroupDto(String name) {
        this.name = name;
    }
}
