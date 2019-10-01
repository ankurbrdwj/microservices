package com.ankur.architect.arch.order.service;

import com.ankur.architect.arch.order.domain.Order;
import com.ankur.architect.arch.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Set<Order> getOrders(Long customerId) {
        Set<Order> result = new HashSet<>();
        result = orderRepository.findByCustomerId(customerId);
        return result;
    }
}
