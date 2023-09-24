package com.cts.assignment.assignment.services;

import com.cts.assignment.assignment.entities.Cart;
import com.cts.assignment.assignment.entities.Product;
import com.cts.assignment.assignment.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    //Add Card with Product
    public Cart addToCart(List<Product> products) {
        Cart cart = new Cart();
        cart.setProducts(products);
        return cartRepository.save(cart);
    }
    //Delete Cart Product
    public void deleteCart(long cartId) {
        cartRepository.deleteById(cartId);
    }

    //get Cart By Id
    public List<Cart> getCart() {
        return cartRepository.findAll();
    }

    public Optional<Cart> getCartById(long cid) {
        return cartRepository.findById(cid);
    }
}
