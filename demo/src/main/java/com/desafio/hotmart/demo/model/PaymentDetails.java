package com.desafio.hotmart.demo.model;

import com.desafio.hotmart.demo.enums.PaymentMethodEnum;
import com.desafio.hotmart.demo.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment_details")
public class PaymentDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PaymentMethodEnum paymentMethodEnum;
    private String cardNumber;
    private PaymentStatus paymentStatus;

    @ManyToOne
    @JoinColumn(name = "sales_order_id")
    private SalesOrder order;
}
