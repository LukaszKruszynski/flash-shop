package com.shop.service.product;

import com.shop.model.product.Product;
import com.shop.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public void deleteProduct(Product product) {
        repository.delete(product);
    }
}
