package com.ankur.architect.archservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Preferences extends AbstractEntity implements Serializable {

    @Column(name="buildingtype",nullable = false)
    private String buildingType;
    @Column(name="positives",nullable = true)
    private String positives;
    @Column(name="negatives",nullable = true)
    private String negatives;
    @Column(name="changesrequired",nullable = true)
    private String changesRequired;
    @Column(name="lifestyle",nullable = true)
    private String lifeStyle;
    @Column(name="budget",nullable = false)
    private BigDecimal budget;
    @Column(name="designpreference",nullable = true)
    private String designPreference;
    @Column(name="siteselection",nullable = true)
    private String siteSelection;
    @Column(name="feedback",nullable = true)
    private String feedback;
    @Column(name="roomdetails",nullable = true)
    private String roomDetails;
    @Column(name="interiordetails",nullable = true)
    private String interiorDetails;
    @Column(name="pointdfcontact",nullable = true)
    private String pointOfContact;
}
