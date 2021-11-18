package com.xyh.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xyh
 * @date 2021/11/17 14:47
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //定义为随机
        return new RandomRule();
    }
}
