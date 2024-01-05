package com.desafio.hotmart.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.desafio.hotmart.demo.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "sales_order")
public class SalesOrder {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private UUID code = UUID.randomUUID();

    @NotNull
    private String personEmail;
    
    @NotNull
    private Long personId;

    @NotNull
    private Double amount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PaymentDetails> paymentDetails = new ArrayList<>();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<SalesOrderItem> items = new ArrayList<>();
    
    private String discountCode;
    private PaymentStatus paymentStatus;

    public SalesOrder() {
    }

    public SalesOrder(Long id, @NotNull String personEmail, @NotNull Long personId, @NotNull Double amount,
            List<PaymentDetails> paymentDetails, List<SalesOrderItem> items, String discountCode,
            PaymentStatus paymentStatus) {
        this.id = id;
        this.personEmail = personEmail;
        this.personId = personId;
        this.amount = amount;
        this.paymentDetails = paymentDetails;
        this.items = items;
        this.discountCode = discountCode;
        this.paymentStatus = paymentStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<PaymentDetails> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<SalesOrderItem> getItems() {
        return items;
    }

    public void setItems(List<SalesOrderItem> items) {
        this.items = items;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
