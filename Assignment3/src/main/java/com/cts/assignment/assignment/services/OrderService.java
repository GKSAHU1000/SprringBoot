package com.cts.assignment.assignment.services;

import com.cts.assignment.assignment.entities.Cart;
import com.cts.assignment.assignment.entities.Order;
import com.cts.assignment.assignment.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    //Place to Order
    public Order placeOrder(Cart cart) {
        Order order = new Order();
        order.setProducts(cart.getProducts());
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    //getAll Orders
    public List<Order> getAllOrders() {
       return orderRepository.findAll();
    }
}