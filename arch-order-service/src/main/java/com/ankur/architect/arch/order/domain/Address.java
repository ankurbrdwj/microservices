package com.ankur.architect.arch.order.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class Address extends AbstractEntity implements Serializable {
/*    @ManyToOne
    @JoinColumn(name="customer_id",nullable=false)
    private Customer customer;*/
    @Column(name="address_1",nullable = false)
    private String address_1;
    @Column(name="address_2",nullable = true)
    private String address_2;
    @Column(name="landmark",nullable = true)
    private String landMark;
    @Column(name="pincode",nullable = false)
    private int pinCode;
    @Column(name="city",nullable = false)
    private String city;
    @Column(name="state",nullable = false)
    private String state;
    @Column(name="country",nullable = false)
    private String country;
/*    @OneToMany(mappedBy = "shippingAddress")
    private Set<Order> shippedOrders;
    @OneToMany(mappedBy = "billingAddress")
    private Set<Order> billedOrders;*/

}
