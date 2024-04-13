package com.jefferson.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
