package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "order_id"))
@Table(name = "orders")
@Entity
public class Order extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER)
    private Member member;

    private String productName;
    private Integer price;
}
