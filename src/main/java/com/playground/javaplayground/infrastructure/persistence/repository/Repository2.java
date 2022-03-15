package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import com.playground.javaplayground.infrastructure.persistence.entity.TestMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequiredArgsConstructor
@Repository
public class Repository2 {

    @PersistenceContext
    EntityManager em;

    private final Repository1 repository1;

    public void hello() {
        em.find(Member.class, 1L);
        System.out.println("em = " + em);
        System.out.println("em.equals(repository1.em) = " + em.equals(repository1.em));
    }
}
