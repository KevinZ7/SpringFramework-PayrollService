package com.KevinZ7.Payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.KevinZ7.Payroll.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
