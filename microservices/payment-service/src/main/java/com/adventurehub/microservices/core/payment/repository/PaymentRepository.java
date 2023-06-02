package com.adventurehub.microservices.core.payment.repository;

import com.adventurehub.microservices.core.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
    List<PaymentEntity> findByUserId(Integer userId);
    boolean existsByPaymentMethod(String paymentMethod);

    boolean existsByPaymentDate(String paymentDate);
}
