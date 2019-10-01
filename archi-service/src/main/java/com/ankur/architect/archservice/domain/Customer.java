package com.ankur.architect.archservice.domain;


import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Customer extends AbstractEntity implements Serializable {

    @Column(name="title",nullable = false)
    private String title;
    @Column(name="firstname",nullable = false)
    private String firstName;
    @Column(name="lastname",nullable = false)
    private String lastName;
    @Column(name="mobile",nullable = false)
    private String mobile;
    @Column(name="landline",nullable = true)
    private String landline;
    @Column(name="emailaddress",unique = true)
    private String emailAddress;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Address> addresses;
    @Column(name="preferences")
    private Preferences preferences;

}
