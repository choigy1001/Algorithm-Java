package com.playground.javaplayground.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AsyncService {

    private final AnotherService anotherService;

    @Async
    public void asyncMethod(int i) {
        try {
            Thread.sleep(500);
            anotherService.print(i);
//            log.info("[AsyncMethod]"+"-"+i);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
