package com.xyh.springcloud.service;

/**
 * @author xyh
 * @date 2021/11/18 9:35
 */
public interface IPaymentService {

    public String paymentInfoOK(Integer id);

    public String paymentInfoTimeOut(Integer id);

    public String paymentCircuitBreaker(Integer id);
}
