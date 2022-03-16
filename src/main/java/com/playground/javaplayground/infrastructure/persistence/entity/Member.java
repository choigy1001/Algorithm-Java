package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.*;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AttributeOverride(name = "id", column = @Column(name = "member_id"))
@Entity
public class Member extends BaseEntity {

    private String name;

    private Integer age;

    @OneToMany(mappedBy = "member")
    private List<Order> orders;

    public Member(String name, Integer age) {
        this(name, age, null);
    }

    public Member(String name, Integer age, List<Order> orders) {
        this.name = name;
        this.age = age;
        this.orders = orders;
    }
}
