package com.playground.javaplayground.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable() //Http basic Auth 기반으로 로그인 인증창이 뜬다. disable 하면 뜨지 뜨지 않음
                .csrf().disable() //rest api 일때는 csrf 보안이 필요없기에 disable -> 굳이 해야하는가? 성능에 이슈가 있는지 확인 필요
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //세션 사용하지 않고 JWT로 인증시 세션 생성하지 못하게
                .and()
                .authorizeRequests()
                    .antMatchers(HttpMethod.POST,"/test/**").permitAll()
                    .antMatchers(HttpMethod.GET, "/test/**").permitAll()
                    .antMatchers(HttpMethod.GET, "/async").permitAll()
                .anyRequest().authenticated();

    }
}
