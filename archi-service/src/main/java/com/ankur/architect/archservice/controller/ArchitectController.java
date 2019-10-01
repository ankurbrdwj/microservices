package com.ankur.architect.archservice.controller;

import com.ankur.architect.archservice.dto.CustomerDTO;
import com.ankur.architect.archservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArchitectController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer" +
            "{customerId}", method = RequestMethod.GET,headers="Accept=application/json")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable long customerId) {
        CustomerDTO dto = customerService.getCustomerById(customerId);
        return new ResponseEntity<CustomerDTO>(dto, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST,headers="Accept=application/json")
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customer) {
         CustomerDTO dto = customerService.saveCustomer(customer);
        return new ResponseEntity<CustomerDTO>(dto, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/customer" +
            "{orderId}", method = RequestMethod.GET,headers="Accept=application/json")
    public ResponseEntity<CustomerDTO> getCustomerByOrder(@PathVariable long orderId) {
        CustomerDTO dto = customerService.getCustomerByOrderId(orderId);
        return new ResponseEntity<CustomerDTO>(dto, HttpStatus.OK);
    }

}
