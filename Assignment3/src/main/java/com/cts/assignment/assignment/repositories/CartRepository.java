package com.cts.assignment.assignment.repositories;

import com.cts.assignment.assignment.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {}
