package com.desafio.hotmart.demo.model;

import java.util.List;

import com.desafio.hotmart.demo.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sales_order")
public class SalesOrder {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String personEmail;
    private Long personId;
    private Long producerId;
    private Double amount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<PaymentDetails> paymentDetails;
    
    private String discountCode;
    private Long offerId;

    private PaymentStatus paymentStatus;
}
