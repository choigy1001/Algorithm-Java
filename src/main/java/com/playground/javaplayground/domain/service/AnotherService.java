package com.playground.javaplayground.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnotherService {

    public void print(int number) {
        log.info("number = {}", number);
    }
}
