package com.ankur.architect.arch.order.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "version")
    private int version;
    @Column(name = "createddate")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
}
