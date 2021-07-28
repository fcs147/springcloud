package com.fz.springcloud.service.Impl;

import com.fz.springcloud.dao.PaymentDao;

import com.fz.springcloud.entities.Payment;
import com.fz.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:
 * @date: 2021/7/8 21:21
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
