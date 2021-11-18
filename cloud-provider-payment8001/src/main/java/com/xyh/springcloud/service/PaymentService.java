package com.xyh.springcloud.service;

import com.xyh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xyh
 * @date 2021/11/16 18:33
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
