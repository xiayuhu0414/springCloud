package com.xyh.springcloud.service.impl;

import com.xyh.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author xyh
 * @date 2021/11/18 17:33
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
