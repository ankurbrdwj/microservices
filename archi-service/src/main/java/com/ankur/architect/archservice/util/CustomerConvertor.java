package com.ankur.architect.archservice.util;

import com.ankur.architect.archservice.domain.Customer;
import com.ankur.architect.archservice.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerConvertor implements GenericConvertor<Customer, CustomerDTO> {

    @Autowired
    AddressConvertor addressConvertor;
    @Autowired
    PreferencesConvertor preferencesConvertor;
    @Autowired
    OrderConvertor orderConvertor;

    @Override
    public Customer createEntity(final CustomerDTO dto) {
        Customer dest = new Customer();
        dest.setId(dto.getId());
        dest.setVersion(dto.getVersion());
        dest.setCreatedDate(dto.getCreatedDate());
        dest.setFirstName(dto.getFirstName());
        dest.setLastName(dto.getLastName());
        dest.setMobile(dto.getMobile());
        dest.setLandline(dto.getLandline());
        dest.setAddresses(addressConvertor.createFromDtos(dto.getAddresses()));
        dest.setEmailAddress(dto.getEmailAddress());
        dest.setTitle(dto.getTitle());
        dest.setPreferences(preferencesConvertor.createEntity(dto.getPreferences()));
        return dest;
    }

    @Override
    public CustomerDTO createDTO(final Customer entity) {
        CustomerDTO dest = new CustomerDTO();
        dest.setId(entity.getId());
        dest.setVersion(entity.getVersion());
        dest.setCreatedDate(entity.getCreatedDate());
        dest.setFirstName(entity.getFirstName());
        dest.setLastName(entity.getLastName());
        dest.setMobile(entity.getMobile());
        dest.setLandline(entity.getLandline());
        dest.setAddresses(addressConvertor.createFromEntities(entity.getAddresses()));
        dest.setEmailAddress(entity.getEmailAddress());
        dest.setTitle(entity.getTitle());
        dest.setPreferences(preferencesConvertor.createDTO(entity.getPreferences()));
        return dest;
    }

}
