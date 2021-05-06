package com.shop.service.product;

import com.shop.model.product.Product;
import com.shop.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Product> getProducts() {
        return repository.findAll();
    }
    public List<Product> findProductsByName(String name) {
        return getProducts().stream()
                .filter(p -> p.getName().contains(name))
                .collect(Collectors.toList());
    }
}
