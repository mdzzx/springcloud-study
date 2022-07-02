package com.zyy.springcloud.service.impl;

import com.zyy.springcloud.dao.PaymentDao;
import com.zyy.springcloud.entities.Payment;
import com.zyy.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }


}
