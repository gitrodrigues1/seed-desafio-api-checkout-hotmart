package com.desafio.hotmart.demo.dto;

import java.util.List;
import com.desafio.hotmart.demo.enums.PaymentStatus;

import jakarta.validation.constraints.NotBlank;

public record CreateSalesOrderDto(
        @NotBlank String personEmail, 
        List<CreatePaymentDetailsDto> payments, 
        List<CreateSalesOrderItemDto> items,
        String discountCode,
        PaymentStatus paymentStatus        
) {

        //[x] personId deve ser localizado através de email, e caso não exista, será criado um novo.
        //[x] amount deve ser calculado via service.
   
}
