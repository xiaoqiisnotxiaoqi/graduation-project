package com.wxc.edu.graduation.project.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GraduationProjectEureka {

    public static void main(String[] args) {
        SpringApplication.run(GraduationProjectEureka.class,args);
    }
}
