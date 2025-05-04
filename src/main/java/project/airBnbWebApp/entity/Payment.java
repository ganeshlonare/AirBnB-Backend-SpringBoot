package project.airBnbWebApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import project.airBnbWebApp.entity.enums.PaymentStatus;

import java.math.BigDecimal;

@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String transactionId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus;

    @Column(nullable = false, precision = 10 , scale = 2)
    private BigDecimal amount;
}
