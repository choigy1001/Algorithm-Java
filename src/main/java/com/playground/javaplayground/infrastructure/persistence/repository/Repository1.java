package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import com.playground.javaplayground.infrastructure.persistence.entity.TestMember;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class Repository1 {

    @PersistenceContext
    EntityManager em;

    public void hello() {
//        em.persist(new TestMember(1L, "member1", 15));
        em.persist(new Member("member1", 15));
        System.out.println("em = " + em);
    }

}
