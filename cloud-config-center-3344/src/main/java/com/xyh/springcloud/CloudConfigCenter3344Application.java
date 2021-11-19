package com.xyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xyh
 * @date 2021/11/19 10:05
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class,args);
    }
}
