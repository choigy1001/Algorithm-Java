package com.playground.javaplayground.domain.service;


import com.playground.javaplayground.infrastructure.persistence.entity.Member;

public interface MemberService {
    void saveMember(Member member);

    void logic();
}
