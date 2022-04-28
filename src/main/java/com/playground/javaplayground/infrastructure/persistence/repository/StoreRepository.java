package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoreRepository extends JpaRepository<StoreEntity, Long>, StoreRepositoryCustom {
//    Optional<StoreEntity> findById(Long id);
}
