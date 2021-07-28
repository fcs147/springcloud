package com.fz.springcloud.service;

import com.fz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author:
 * @date: 2021/7/8 21:20
 * @description:
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long  id);
}
