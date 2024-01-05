package com.desafio.hotmart.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.hotmart.demo.model.PaymentDetails;
import com.desafio.hotmart.demo.model.SalesOrder;
import com.desafio.hotmart.demo.model.SalesOrderItem;
import com.desafio.hotmart.demo.records.CreateSalesOrder;
import com.desafio.hotmart.demo.repository.SalesOrderRepository;

@Service
public class SalesOrderService {

    private SalesOrderRepository salesOrderRepository;

    public SalesOrderService(SalesOrderRepository salesOrderRepository) {
        this.salesOrderRepository = salesOrderRepository;
    }

    public SalesOrder createOrder(CreateSalesOrder form) {
        SalesOrder order = new SalesOrder();
        order.setPersonEmail(form.personEmail());
        order.setPersonId(form.personId());
        List<SalesOrderItem> items = form.items().stream()
            .map(i -> new SalesOrderItem(null, i.productId(), i.quantity(), i.amount(), order)).toList();
        order.setItems(items);
        List<PaymentDetails> payments = form.payments().stream()
            .map(p -> new PaymentDetails(null, p.paymentMethodEnum(), p.cardNumber(), p.paymentStatus(), order)).toList();
        order.setPaymentDetails(payments);
        Double total = items.stream().mapToDouble(SalesOrderItem::getAmountItem).sum();
        order.setAmount(total);
        order.setDiscountCode(form.discountCode());
        order.setPaymentStatus(form.paymentStatus());

        return salesOrderRepository.save(order);
    }

    public SalesOrder getOrderById(Long id) {
        return salesOrderRepository.findById(id).get();
    }

    public List<SalesOrder> findAll() {
        return salesOrderRepository.findAll(); 
    }

    // [ ] create deleteOrder method
    
}
