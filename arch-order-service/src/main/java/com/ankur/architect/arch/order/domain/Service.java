package com.ankur.architect.arch.order.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Service extends AbstractEntity implements Serializable {
/*    @ManyToOne
    @JoinColumn(name="order_id",nullable=false)
    private Order order;*/
    @Column(name="servicetype",nullable = false)
    private ServiceType serviceType;
    @Column(name="servicecount",nullable = false)
    private int serviceCount;
    @Column(name="price",nullable = false)
    private BigDecimal price;

}
