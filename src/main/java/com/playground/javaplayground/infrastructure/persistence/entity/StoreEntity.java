package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class StoreEntity {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    private String storeName;

    private String storeNumber;

    private String address;

    //compileJava 했다가 builder랑 충돌했는데 왜 final로 해결되는지 생각해보기~~~
    @OneToMany(mappedBy = "storeEntity")
    private final List<FoodEntity> foodEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "storeEntity")
    private final List<ProductEntity> productEntityList = new ArrayList<>();
}
