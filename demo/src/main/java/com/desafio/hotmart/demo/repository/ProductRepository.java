package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
