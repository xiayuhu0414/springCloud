package com.xyh.springcloud.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xyh
 * @date 2021/11/17 10:59
 */
@RestController
@Slf4j
public class OrderConsulController {
    public static final String INVOKE_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result=restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
