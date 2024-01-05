package com.desafio.hotmart.demo.dto;

public record CreateSalesOrderItemDto(
    Long productId, 
    Integer quantity, 
    Double amount) {

        // [ ] Item não precisa do total. Ele deve ser calculado automaticamente no service.
    
}
