package com.desafio.hotmart.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.hotmart.demo.dto.CreateSalesOrderDto;
import com.desafio.hotmart.demo.model.SalesOrder;
import com.desafio.hotmart.demo.service.SalesOrderService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/orders")
public class SalesOrderController {

    private SalesOrderService orderService;

    public SalesOrderController(SalesOrderService orderService) {
        this.orderService = orderService;
    }
    
    @PostMapping()
    public SalesOrder createOrder(@Valid @RequestBody CreateSalesOrderDto form) {
        return orderService.createOrder(form);
    }

    @GetMapping
    public List<SalesOrder> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public SalesOrder getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
    
}
