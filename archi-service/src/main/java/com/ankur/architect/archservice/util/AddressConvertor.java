package com.ankur.architect.archservice.util;

import com.ankur.architect.archservice.domain.Address;
import com.ankur.architect.archservice.dto.AddressDTO;

public class AddressConvertor  implements GenericConvertor<Address, AddressDTO>{

    @Override
    public Address createEntity(AddressDTO dto) {
        Address dest = new Address();
        dest.setId(dto.getId());
        dest.setVersion(dto.getVersion());
        dest.setCreatedDate(dto.getCreatedDate());
        dest.setAddress_1(dto.getAddress_1());
        dest.setAddress_2(dto.getAddress_2());
        dest.setLandMark(dto.getLandMark());
        dest.setPinCode(dto.getPinCode());
        dest.setCity(dto.getCity());
        dest.setState(dto.getState());
        dest.setCountry(dto.getCountry());
        return dest;
    }

    @Override
    public AddressDTO createDTO(Address entity) {
        return null;
    }
}
