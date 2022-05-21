package com.playground.javaplayground.interfaces.controller;

import com.playground.javaplayground.domain.service.MemberService;
import com.playground.javaplayground.domain.service.NoMappingService;
import com.playground.javaplayground.domain.service.StoreService;
import com.playground.javaplayground.infrastructure.persistence.entity.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/test")
@RestController
public class TestController {

    private final MemberService memberService;
    private final StoreService storeService;
    private final NoMappingService noMappingService;

    @PostMapping
    public String test() {

        log.info("Post Test OK");

        return "ok";
    }

    @GetMapping
    public String getTest() {
        log.info("Get Test OK");

        return "ok";
    }

    @PostMapping("/sub")
    public String PostSubResponse() {
        log.info("PostSubResponse");

        return "PostSub";
    }

    @PostMapping("/repository")
    public String EmTest() {
        memberService.logic();
        return "EmTest ok";
    }

    @PostMapping("/eager")
    public String egTest() {
        memberService.eager();
        return "eager ok";
    }

    @PostMapping("/exception")
    public String testException() {
        memberService.exceptionTest();
        return "exception Test ok";
    }

    @GetMapping("/food")
    public String foodTest() {
        storeService.storeServiceTest();
        return "food ok";
    }

    @GetMapping("/datajpa")
    public String foodJpa() {
        noMappingService.dataJpaTest();
        return "data jpa ok";
    }
    @GetMapping("/datajpa2")
    public String foodJpa2() {
        return noMappingService.dataJpaTest2();
    }
}
