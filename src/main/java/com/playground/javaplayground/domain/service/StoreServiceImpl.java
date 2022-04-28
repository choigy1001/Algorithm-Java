package com.playground.javaplayground.domain.service;

import com.playground.javaplayground.infrastructure.persistence.entity.FoodEntity;
import com.playground.javaplayground.infrastructure.persistence.entity.ProductEntity;
import com.playground.javaplayground.infrastructure.persistence.entity.StoreEntity;
import com.playground.javaplayground.infrastructure.persistence.repository.FoodRepository;
import com.playground.javaplayground.infrastructure.persistence.repository.ProductRepository;
import com.playground.javaplayground.infrastructure.persistence.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class StoreServiceImpl implements StoreService{

    private final StoreRepository storeRepository;
    private final FoodRepository foodRepository;
    private final ProductRepository productRepository;

    @Override
    public void storeServiceTest() {

//        Optional<StoreEntity> findStore = storeRepository.findById(1L);
//        productRepository.save(
//                ProductEntity.builder()
//                        .productName("좋은 상품")
//                        .storeEntity(findStore.get())
//                        .build()
//        );
        //innerjoin에 맞는 데이터가 없으면 아예 null로 가져온다.
        Optional<StoreEntity> storeEntity = storeRepository.fetchFood(1L);
        System.out.println("storeEntity.get().getStoreName() = " + storeEntity.get().getStoreName());
        System.out.println("storeEntity.get().getProductEntityList() = " + storeEntity.get().getProductEntityList());
    }
}
