package com.org.paymentservice.dao.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEntity {

    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    @Size(max = 50)
    private String paymentId;

    @Column(name = "name")
    @Size(max = 256)
    private String name;

    @Column(name = "email")
    @Size(max = 256)
    private String email;

    @Column(name = "phone")
    @Size(max = 50)
    private String phone;

    @Column(name = "amount")
    private long amount;

}
