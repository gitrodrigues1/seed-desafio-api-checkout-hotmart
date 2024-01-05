package com.desafio.hotmart.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.hotmart.demo.model.Offer;
import com.desafio.hotmart.demo.service.OfferService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/v1/offers")
public class OfferController {
    
    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/{offerId}")
    public ResponseEntity<Offer> getOffer(@PathVariable Long offerId) {
        Offer offer = offerService.getOfferById(offerId);
        return new ResponseEntity<>(offer, HttpStatus.OK);
    }
    
}
