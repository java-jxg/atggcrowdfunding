package com.atguigu.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Atcrowdfunding08MemberEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Atcrowdfunding08MemberEurekaApplication.class, args);
    }

}
