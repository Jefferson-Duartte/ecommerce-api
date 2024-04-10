package com.jefferson.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
