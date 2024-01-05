package com.desafio.hotmart.demo.records;

import java.util.List;
import com.desafio.hotmart.demo.enums.PaymentStatus;

public record CreateSalesOrder(
        String personEmail, 
        Long personId, 
        Double amount, 
        List<CreatePaymentDetailsDto> payments, 
        List<CreateSalesOrderItemDto> items,
        String discountCode,
        PaymentStatus paymentStatus        
) {

   
}
