package com.paymentservice.paymentservice.service;

import com.paymentservice.paymentservice.dao.entity.PaymentEntity;
import com.paymentservice.paymentservice.dao.mapper.PaymentJpaMapper;
import com.paymentservice.paymentservice.dao.repository.PaymentRepository;
import com.paymentservice.paymentservice.dto.request.PaymentRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentEntity createPayment(PaymentRequestDTO paymentRequestDTO) {
        PaymentEntity paymentEntity = PaymentJpaMapper.toEntity(paymentRequestDTO);
        return paymentRepository.save(paymentEntity);
    }
}
