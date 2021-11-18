package com.xyh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xyh
 * @date 2021/11/16 19:36
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced //赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
