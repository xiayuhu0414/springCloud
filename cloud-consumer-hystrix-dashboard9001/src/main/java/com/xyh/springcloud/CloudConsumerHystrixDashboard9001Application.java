package com.xyh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xyh
 * @date 2021/11/18 19:30
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001Application.class, args);
        System.out.println("启动成功");
    }
}
