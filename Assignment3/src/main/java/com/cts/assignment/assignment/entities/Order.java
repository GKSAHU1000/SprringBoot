package com.cts.assignment.assignment.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<Product> product;
    private LocalDateTime orderDate;

    public Order() {
    }

    public Order(Long id, List<Product> products, LocalDateTime orderDate) {
        this.id = id;
        this.product = products;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return product;
    }

    public void setProducts(List<Product> products) {
        this.product = products;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + product.toString() +
                ", orderDate=" + orderDate +
                '}';
    }
}
