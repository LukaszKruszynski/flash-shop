package com.shop.mapper.product;

import com.shop.dto.product.ProductDto;
import com.shop.model.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProductMapper {

    public Product mapToProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .build();
    }

    public List<Product> mapToProducts(List<ProductDto> productsDto) {
        return productsDto.stream().
                map(this::mapToProduct)
                .collect(Collectors.toList());
    }

    public ProductDto mapToProductDto(Product product) {
       return ProductDto.builder()
               .id(product.getId())
               .name(product.getName())
               .description(product.getDescription())
               .price(product.getPrice())
               .build();
    }

    public List<ProductDto> mapToProductDtos(List<Product> products) {
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
