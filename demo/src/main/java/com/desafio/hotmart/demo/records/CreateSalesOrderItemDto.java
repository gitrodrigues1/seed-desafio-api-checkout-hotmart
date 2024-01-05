package com.desafio.hotmart.demo.records;

public record CreateSalesOrderItemDto(
    Long productId, 
    Integer quantity, 
    Double amount) {
    
}
