package com.ankur.architect.archservice.dto;

import lombok.Data;

import java.util.Set;
@Data
public class CustomerDTO extends AbstractDTO {
    private String title;
    private String firstName;
    private String lastName;
    private String mobile;
    private String landline;
    private String emailAddress;
    private Set<AddressDTO> addresses;
    private Set<OrderDTO> orders;
    private PreferencesDTO preferences;

    public String setFirstName(String firstName) {
        return this.firstName=firstName;
    }
}
