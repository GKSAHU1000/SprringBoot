package com.cts.assignment.assignment.repositories;

import com.cts.assignment.assignment.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {}