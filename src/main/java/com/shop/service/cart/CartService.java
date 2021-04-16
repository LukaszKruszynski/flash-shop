package com.shop.service.cart;

import com.shop.model.cart.Cart;
import com.shop.repository.cart.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository repository;

    public Cart saveCart(Cart cart) {
        return repository.save(cart);
    }

    public void deleteCart(Cart cart) {
        repository.delete(cart);
    }

}
