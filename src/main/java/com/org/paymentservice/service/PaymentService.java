package com.org.paymentservice.service;

import com.org.paymentservice.dao.entity.PaymentEntity;
import com.org.paymentservice.dao.mapper.PaymentJpaMapper;
import com.org.paymentservice.dao.repository.PaymentRepository;
import com.org.paymentservice.dto.request.PaymentRequestDTO;
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
