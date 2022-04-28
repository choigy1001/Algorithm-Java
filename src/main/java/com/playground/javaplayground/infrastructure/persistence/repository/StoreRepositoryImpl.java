package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.QStoreEntity;
import com.playground.javaplayground.infrastructure.persistence.entity.StoreEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;


@RequiredArgsConstructor
@Component
public class StoreRepositoryImpl implements StoreRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public Optional<StoreEntity> fetchFood(Long storeId) {
        return Optional.ofNullable(queryFactory
                .selectFrom(QStoreEntity.storeEntity)
                .innerJoin(QStoreEntity.storeEntity.foodEntityList)
                .innerJoin(QStoreEntity.storeEntity.productEntityList)
                .fetchJoin()
                .where(QStoreEntity.storeEntity.id.eq(storeId))
                .fetchFirst());
    }
}
