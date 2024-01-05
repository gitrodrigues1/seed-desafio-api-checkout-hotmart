package com.desafio.hotmart.demo.records;

import com.desafio.hotmart.demo.enums.PaymentMethodEnum;
import com.desafio.hotmart.demo.enums.PaymentStatus;

public record CreatePaymentDetailsDto(
    PaymentMethodEnum paymentMethodEnum, 
    String cardNumber, 
    PaymentStatus paymentStatus) {

}
