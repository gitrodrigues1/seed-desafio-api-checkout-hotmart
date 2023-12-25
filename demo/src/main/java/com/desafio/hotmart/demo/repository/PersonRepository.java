package com.desafio.hotmart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.hotmart.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
