package com.paymentservice.paymentservice.controller;


import com.paymentservice.paymentservice.dao.entity.PaymentEntity;
import com.paymentservice.paymentservice.dto.request.PaymentRequestDTO;
import com.paymentservice.paymentservice.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Log4j2
public class PaymentController {

    private final PaymentService paymentservice;

    @PostMapping("/payment")
    public PaymentEntity initializePayment(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        return paymentservice.createPayment(paymentRequestDTO);
    }

}
