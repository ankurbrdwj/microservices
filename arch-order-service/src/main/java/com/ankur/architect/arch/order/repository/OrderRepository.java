package com.ankur.architect.arch.order.repository;

import com.ankur.architect.arch.order.domain.Order;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface OrderRepository extends Repository<Order, Long> {

    void delete(Order deleted);

    Set<Order> findAll();

    Order findById(Long OrderId);

    Order save(Order persisted);

    @Query("select o from Order o, Customer c where o.Id = c.Id and c.Id =:customerId")
    Set<Order> findByCustomerId(@Param("customerId") Long customerId);

}
