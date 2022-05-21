package com.playground.javaplayground.infrastructure.persistence.repository;

import com.playground.javaplayground.infrastructure.persistence.entity.NoMappingEntity;
import com.playground.javaplayground.infrastructure.persistence.entity.TestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoMappingRepository extends JpaRepository<NoMappingEntity, Long> {

    void deleteById(Long id);

    void deleteByContent(String content);

    Optional<NoMappingEntity> findByContent(String content);

    Optional<NoMappingEntity> findByContent2(String check);

    Optional<NoMappingEntity> findByTestStatus(TestStatus testStatus);

}
