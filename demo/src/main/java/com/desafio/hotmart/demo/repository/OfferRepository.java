package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{
    
}
