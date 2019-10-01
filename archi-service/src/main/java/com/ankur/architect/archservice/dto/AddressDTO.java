package com.ankur.architect.archservice.dto;

import lombok.Data;

@Data
public class AddressDTO extends AbstractDTO {

    private String address_1;
    private String address_2;
    private String landMark;
    private int pinCode;
    private String city;
    private String state;
    private String country;
}
