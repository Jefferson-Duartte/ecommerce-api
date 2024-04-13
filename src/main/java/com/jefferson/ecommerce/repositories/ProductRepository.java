package com.jefferson.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.ecommerce.entities.Category;
import com.jefferson.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
