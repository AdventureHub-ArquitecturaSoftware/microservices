package com.adventurehub.microservices.core.payment.services;

import com.adventurehub.microservices.core.payment.entity.PaymentEntity;
import com.adventurehub.microservices.core.payment.mapper.PaymentMapper;
import com.adventurehub.microservices.core.payment.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.adventurehub.api.core.payment.PaymentService;
import com.adventurehub.api.core.payment.Payment;
import com.adventurehub.util.exceptions.InvalidInputException;
import com.adventurehub.util.exceptions.NotFoundException;
import com.adventurehub.util.http.ServiceUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PaymentServiceImpl implements PaymentService {

    private static final Logger LOG = LoggerFactory.getLogger(PaymentServiceImpl.class);

    private final ServiceUtil serviceUtil;
    private final PaymentMapper mapper;
    private final PaymentRepository repository;

    @Autowired
    public PaymentServiceImpl(ServiceUtil serviceUtil, PaymentMapper mapper, PaymentRepository repository) {
        this.serviceUtil = serviceUtil;
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<Payment> getPayments(Integer userId) {
        LOG.debug("/payment return the found payment for userId={}", userId);

        if (userId < 1) throw new InvalidInputException("Invalid userId: " + userId);

        if (userId == 13) throw new NotFoundException("No product found for userId: " + userId);

        List<Payment> list = new ArrayList<>();

        List<PaymentEntity> paymentEntities = repository.findByUserId(userId);

        for (PaymentEntity paymentEntity : paymentEntities) {
            Payment payment = PaymentMapper.INSTANCE.entityToApi(paymentEntity);
            payment.setServiceAddress(serviceUtil.getServiceAddress());
            list.add(payment);
        }

        LOG.debug("/payment response size: {}", list.size());

        return list;
    }

    @Override
    public void makePayment(Payment payment){
        LOG.debug("/payment/make called with payment={}", payment);

        if (payment.getAmount() <= 0) {
            throw new InvalidInputException("Invalid payment amount: " + payment.getAmount());
        }

        String paymentType = payment.getPaymentMethod();
        if (!isValidPaymentType(paymentType)) {
            throw new InvalidInputException("Invalid payment type: " + paymentType);
        }

        boolean paymentProcessed = processPayment(payment);

        if (!paymentProcessed) {
            throw new RuntimeException("Payment processing failed for payment: " + payment);
        }

        LOG.debug("Payment processed successfully: {}", payment);
    }

    private boolean isValidPaymentType(String paymentType) {
        List<String> allowedPaymentTypes = Arrays.asList("Credit Card", "PayPal", "PagoEfectivo");
        return allowedPaymentTypes.contains(paymentType);
    }

    private boolean processPayment(Payment payment) {
        LOG.debug("Processing payment: {}", payment);
        return true;
    }

}