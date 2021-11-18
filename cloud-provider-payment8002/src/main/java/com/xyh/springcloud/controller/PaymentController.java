package com.xyh.springcloud.controller;

import com.xyh.springcloud.entities.Payment;
import com.xyh.springcloud.service.PaymentService;
import com.xyh.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xyh
 * @date 2021/11/16 18:41
 */
@Controller
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录", null);
        }


    }
    @GetMapping(value = "/payment/lb")
    @ResponseBody
    public String getPaymentLB() {
        return serverPort;
    }
}
