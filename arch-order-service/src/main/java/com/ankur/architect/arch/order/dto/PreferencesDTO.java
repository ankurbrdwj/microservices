package com.ankur.architect.arch.order.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PreferencesDTO extends AbstractDTO {
    private String buildingType;
    private String positives;
    private String negatives;
    private String changesRequired;
    private String lifeStyle;
    private BigDecimal budget;
    private String designPreference;
    private String siteSelection;
    private String feedback;
    private String roomDetails;
    private String interiorDetails;
    private String pointOfContact;
}
