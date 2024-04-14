package com.jefferson.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.ecommerce.entities.OrderItem;
import com.jefferson.ecommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
