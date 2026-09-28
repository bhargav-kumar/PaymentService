package com.org.paymentservice.dao.mapper;

import com.org.paymentservice.dao.entity.PaymentEntity;
import com.org.paymentservice.dto.request.PaymentRequestDTO;

public class PaymentJpaMapper {

    public static PaymentEntity toEntity(PaymentRequestDTO paymentRequestDTO) {
        return PaymentEntity.builder()
                .paymentId(paymentRequestDTO.getPaymentId())
                .name(paymentRequestDTO.getName())
                .email(paymentRequestDTO.getEmail())
                .phone(paymentRequestDTO.getPhone())
                .amount(paymentRequestDTO.getAmount())
                .build();
    }
}
