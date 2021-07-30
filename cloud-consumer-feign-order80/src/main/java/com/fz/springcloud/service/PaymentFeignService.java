package com.fz.springcloud.service;

import com.fz.springcloud.entities.CommonResult;
import com.fz.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:
 * @date: 2021/7/30 14:26
 * @description:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}" )
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long  id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
