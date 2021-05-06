package com.shop.controller.product;

import com.shop.dto.product.ProductDto;
import com.shop.mapper.product.ProductMapper;
import com.shop.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    private final ProductMapper mapper;

    @GetMapping()
    public List<ProductDto> getProducts() {
        return mapper.mapToProductDtos(service.getProducts());
    }

    @GetMapping("/search/{name}")
    public List<ProductDto> findProducts(@PathVariable String name) {
        return mapper.mapToProductDtos(service.findProductsByName(name));
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody ProductDto productDto) {
        service.saveProduct(mapper.mapToProduct(productDto));
    }

    @PutMapping("/update")
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return mapper.mapToProductDto(service.saveProduct(mapper.mapToProduct(productDto)));
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestBody ProductDto productDto) {
        service.deleteProduct(mapper.mapToProduct(productDto));
    }
}
