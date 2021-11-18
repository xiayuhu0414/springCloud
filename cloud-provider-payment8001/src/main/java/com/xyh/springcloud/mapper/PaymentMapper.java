package com.xyh.springcloud.mapper;

import com.xyh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xyh
 * @date 2021/11/16 18:17
 */
@Mapper
public interface PaymentMapper {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
