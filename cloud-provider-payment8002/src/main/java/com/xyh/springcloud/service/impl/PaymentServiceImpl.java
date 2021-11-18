package com.xyh.springcloud.service.impl;

import com.xyh.springcloud.entities.Payment;
import com.xyh.springcloud.mapper.PaymentMapper;
import com.xyh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xyh
 * @date 2021/11/16 18:34
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return  paymentMapper.getPaymentById(id);
    }
}
