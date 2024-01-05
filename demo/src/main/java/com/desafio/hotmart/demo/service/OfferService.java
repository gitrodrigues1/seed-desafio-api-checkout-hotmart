package com.desafio.hotmart.demo.service;

import org.springframework.stereotype.Service;

import com.desafio.hotmart.demo.model.Offer;
import com.desafio.hotmart.demo.repository.OfferRepository;

@Service
public class OfferService {

    private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Offer getOfferById(Long id) {
        Offer offer = offerRepository.findById(id).orElse(null);
        return offer;
    }

}
