package com.playground.javaplayground.domain.service;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import com.playground.javaplayground.infrastructure.persistence.repository.Repository1;
import com.playground.javaplayground.infrastructure.persistence.repository.Repository2;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
@Transactional(readOnly = true)
@Service
public class MemberServiceImpl implements MemberService {

    private final Repository1 repository1;
    private final Repository2 repository2;

    @Override
    public void saveMember(Member member) {

    }

    @Transactional
    @Override
    public void logic() {
        repository1.hello();
        repository2.hello();
    }


}
