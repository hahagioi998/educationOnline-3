package com.guli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author GPX
 * @date 2019/12/3 16:41
 */
@ComponentScan(basePackages={"com.guli.edu","com.guli.common"})
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EduApplication {
    public static void main(String[] args){
        SpringApplication.run(EduApplication.class,args);
    }
}
