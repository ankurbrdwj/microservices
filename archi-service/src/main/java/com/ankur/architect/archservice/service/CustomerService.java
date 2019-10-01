package com.ankur.architect.archservice.service;

import com.ankur.architect.archservice.dto.CustomerDTO;
import com.ankur.architect.archservice.repository.CustomerRepository;
import com.ankur.architect.archservice.util.CustomerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    CustomerConvertor customerConvertor;

    public CustomerDTO saveCustomer(CustomerDTO customer) {
        return new CustomerDTO();
    }

    public CustomerDTO getCustomerById(long customerId) {
        return  customerConvertor.createDTO(customerRepository.findById(customerId));
    }

    public CustomerDTO getCustomerByOrderId(long orderId) {
        return  customerConvertor.createDTO(customerRepository.findByOrderId(orderId));
    }
}
