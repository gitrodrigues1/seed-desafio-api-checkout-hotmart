package com.desafio.hotmart.demo.service;

import org.springframework.stereotype.Service;

import com.desafio.hotmart.demo.model.Person;
import com.desafio.hotmart.demo.repository.PersonRepository;

@Service
public class PsersonService {

    private PersonRepository personRepository;

    public PsersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonByEmail(String email) {
        return personRepository.findByEmail(email).get();
    }
    
}
