package com.vasilis_timoudas.order_sevice.repository;

import com.vasilis_timoudas.order_sevice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
