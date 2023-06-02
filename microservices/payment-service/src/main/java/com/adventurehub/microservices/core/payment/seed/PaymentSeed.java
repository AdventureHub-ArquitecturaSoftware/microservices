package com.adventurehub.microservices.core.payment.seed;

import com.adventurehub.api.core.payment.Payment;
import com.adventurehub.microservices.core.payment.entity.PaymentEntity;
import com.adventurehub.microservices.core.payment.mapper.PaymentMapper;
import com.adventurehub.microservices.core.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentSeed {
    private static final double DEFAULT_AMOUNT = 10.0;
    private static final String[] DEFAULT_PAYMENT_TYPES = {"Credit Card", "PayPal"};

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Autowired
    public PaymentSeed(PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
    }

    public void seed() {
        for (String paymentMethod : DEFAULT_PAYMENT_TYPES) {
            if (!paymentRepository.existsByPaymentMethod(paymentMethod)) {
                Payment newPayment = new Payment();
                newPayment.setAmount(DEFAULT_AMOUNT);
                newPayment.setPaymentMethod(paymentMethod);

                PaymentEntity paymentEntity = paymentMapper.apiToEntity(newPayment);
                paymentRepository.save(paymentEntity);
            }
        }
    }
}
