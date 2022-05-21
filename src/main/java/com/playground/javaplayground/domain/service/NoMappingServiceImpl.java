package com.playground.javaplayground.domain.service;

import com.playground.javaplayground.infrastructure.persistence.entity.NoMappingEntity;
import com.playground.javaplayground.infrastructure.persistence.entity.TestStatus;
import com.playground.javaplayground.infrastructure.persistence.repository.NoMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class NoMappingServiceImpl implements NoMappingService{

    private final NoMappingRepository noMappingRepository;
    private final EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public void dataJpaTest() {
        Optional<NoMappingEntity> test = noMappingRepository.findByContent("test");
        System.out.println("test.get() = " + test.get().getContent());

//        noMappingRepository.deleteById(1L);
//        noMappingRepository.deleteByContent("test");
    }

    @Override
    public String dataJpaTest2() {
//        em.clear();
        Optional<NoMappingEntity> byTestStatus = noMappingRepository.findByTestStatus(TestStatus.ONE);
        return byTestStatus.get().getTestStatus().toString();
//        return noMappingRepository.findByContent2("123")
//                .orElseThrow(() -> new RuntimeException())
//                .getContent2();

    }
}
