package com.playground.javaplayground.infrastructure.persistence.repository;


import com.playground.javaplayground.infrastructure.persistence.entity.StoreEntity;

import java.util.Optional;


public interface StoreRepositoryCustom {
    Optional<StoreEntity> fetchFood(Long storeId);
}
