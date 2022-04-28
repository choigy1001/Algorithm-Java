package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
