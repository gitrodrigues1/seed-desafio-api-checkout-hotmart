package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.SalesOrderItem;

public interface SalesOrderItemRepository extends JpaRepository<SalesOrderItem, Long>{
    
}
