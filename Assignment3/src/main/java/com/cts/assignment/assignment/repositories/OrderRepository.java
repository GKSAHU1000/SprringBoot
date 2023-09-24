package com.cts.assignment.assignment.repositories;

import com.cts.assignment.assignment.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Orders, Long> {}