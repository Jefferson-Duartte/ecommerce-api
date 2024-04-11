package com.jefferson.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.ecommerce.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
