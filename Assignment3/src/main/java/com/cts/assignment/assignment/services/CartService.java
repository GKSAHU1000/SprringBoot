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
    public Cart deleteCart(long cartId, long pid) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        if (optionalCart.isPresent()) {
            Cart cart = optionalCart.get();
            Optional<Product> optionalProduct = cart.getProducts().stream().filter(prd -> prd.getId() == pid).findFirst();
            if (optionalProduct.isPresent()) {
                Product product = optionalProduct.get();
                List<Product> products = cart.getProducts();
                products.remove(product);
                cart.setProducts(products);
                return cartRepository.save(cart);
            }
        }

        return null;
    }

    //get Cart By Id
    public Optional<Cart> getCartById(long cartId) {
        return cartRepository.findById(cartId);
    }

}
