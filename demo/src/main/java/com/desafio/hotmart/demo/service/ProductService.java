package com.desafio.hotmart.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.hotmart.demo.model.Product;
import com.desafio.hotmart.demo.repository.ProductRepository;

@Service
public class ProductService {
    
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    
}
