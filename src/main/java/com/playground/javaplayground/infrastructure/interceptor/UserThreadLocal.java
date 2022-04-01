package com.playground.javaplayground.infrastructure.interceptor;

import com.playground.javaplayground.infrastructure.persistence.entity.Member;

public class UserThreadLocal {

    private static final ThreadLocal<Member> threadLocal;

    static{
        threadLocal = new ThreadLocal<>();
    }

    public static void set(Member member) {
        threadLocal.set(member);
    }

    public static void remove() {
        threadLocal.remove();
    }

    public static Member get() {
        return threadLocal.get();
    }
}
