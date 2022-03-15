package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.*;

import javax.persistence.Entity;

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Entity
public class Member extends BaseEntity {

    private String name;

    private Integer age;

}
