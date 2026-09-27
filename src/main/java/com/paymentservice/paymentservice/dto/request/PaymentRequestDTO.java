package com.paymentservice.paymentservice.dto.request;

import lombok.*;
import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.annotation.JsonPOJOBuilder;


@Data
@Builder(toBuilder = true)
@Value
//@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDTO {

    private String paymentId;
    private String name;
    private String email;
    private String phone;
    private long amount;
}
