package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
