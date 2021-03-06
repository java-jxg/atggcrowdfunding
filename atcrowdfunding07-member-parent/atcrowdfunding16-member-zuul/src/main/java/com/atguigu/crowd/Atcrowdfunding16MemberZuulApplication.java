package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Atcrowdfunding16MemberZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Atcrowdfunding16MemberZuulApplication.class, args);
    }

}
