package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import com.playground.javaplayground.infrastructure.persistence.entity.TestMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Slf4j
@Repository
public class Repository1 {

    @PersistenceContext
    EntityManager em;

    public void hello() {
//        em.persist(new TestMember(1L, "member1", 15));
        em.persist(new Member("member1", 15));
        System.out.println("em = " + em);
    }

    /**
     * order 에서 member 를 fetch type eager 로 할 경우 N+1 문제 테스트
     */
    public void EagerTest() {
        em.persist(new Member("member1", 15));
        em.persist(new Member("member2", 30));
        em.flush();
        em.clear();

        log.info("insert to db complete");

        List<Member> members = em.createQuery("select m from Member m", Member.class)
                .getResultList();

        for (Member member : members) {
            log.info("member.getName() = {}", member.getName());
            System.out.println("member.getOrders() = " + member.getOrders());
        }

    }

}
