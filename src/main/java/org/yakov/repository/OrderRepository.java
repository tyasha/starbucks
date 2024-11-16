package org.yakov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yakov.model.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {
}
