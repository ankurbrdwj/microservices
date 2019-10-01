package com.ankur.architect.archservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Orders")
public class Order extends AbstractEntity implements Serializable {

    @ManyToOne(optional = false)
    private Customer customer;

    @ManyToOne
    private Address billingAddress;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Address shippingAddress;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private Set<Service> services = new HashSet<Service>();

}
