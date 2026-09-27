package com.paymentservice.paymentservice.dao.repository;

import com.paymentservice.paymentservice.dao.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, String> {

}
