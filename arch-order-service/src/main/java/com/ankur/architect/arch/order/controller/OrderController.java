package com.ankur.architect.arch.order.controller;

import com.ankur.architect.arch.order.domain.Order;
import com.ankur.architect.arch.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Slf4j
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<Set<Order>> getCustomerOrders(@RequestParam("customerId") Long customerId) {
        log.info("getCustomerOrders with customerId {}", customerId);
        Set<Order> order = orderService.getOrders(customerId);
        if (order == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(order, HttpStatus.OK);
    }
}
