package com.playground.javaplayground.infrastructure.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class NoMappingEntity {
    @Id
    @GeneratedValue
    @Column(name = "no_id")
    private Long id;

    private String content;

    private String content2;

    @Enumerated(EnumType.STRING)
    private TestStatus testStatus;
}
