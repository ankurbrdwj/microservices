package com.ankur.architect.arch.order.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class OrderDTO extends AbstractDTO {
    private CustomerDTO customer;
    private AddressDTO billingAddress;
    private AddressDTO shippingAddress;
    private Set<ServiceDTO> services = new HashSet<ServiceDTO>();
}
