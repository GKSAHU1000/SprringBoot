package com.cts.assignment.assignment.repositories;

import com.cts.assignment.assignment.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}

