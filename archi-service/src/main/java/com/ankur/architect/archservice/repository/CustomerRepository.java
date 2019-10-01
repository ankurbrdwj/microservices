package com.ankur.architect.archservice.repository;

import com.ankur.architect.archservice.domain.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends Repository<Customer, Long> {

    void delete(Customer deleted);

    List<Customer> findAll();

    Customer findById(Long customerId);

    Customer save(Customer persisted);

    @Query("select c from Customer c , Order o where c.Id=o.Id and o.Id=:orderId ")
    Customer findByOrderId(@Param("orderId") Long ordrId);
}
