package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long>{
    
}
