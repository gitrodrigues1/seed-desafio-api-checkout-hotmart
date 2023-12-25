package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.SalesOrderItems;

public interface SalesOrderItemsRepository extends JpaRepository<SalesOrderItems, Long>{
    
}
