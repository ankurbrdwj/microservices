package com.ankur.architect.archservice.util;

import com.ankur.architect.archservice.domain.Order;
import com.ankur.architect.archservice.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderConvertor implements GenericConvertor<Order, OrderDTO> {

    @Autowired
    AddressConvertor addressConvertor;
    @Autowired
    CustomerConvertor customerConvertor;
    @Autowired
    ServiceConvertor serviceConvertor;
    @Override
    public Order createEntity(OrderDTO dto) {
        Order dest = new Order();
        dest.setId(dto.getId());
        dest.setVersion(dto.getVersion());
        dest.setCreatedDate(dto.getCreatedDate());
        dest.setCustomer(customerConvertor.createEntity(dto.getCustomer()));
        dest.setBillingAddress(addressConvertor.createEntity(dto.getBillingAddress()));
        dest.setShippingAddress(addressConvertor.createEntity(dto.getShippingAddress()));
        dest.setServices(serviceConvertor.createFromDtos(dto.getServices()));
    return dest;
    }

    @Override
    public OrderDTO createDTO(Order entity) {
        OrderDTO dest = new OrderDTO();
        dest.setId(entity.getId());
        dest.setVersion(entity.getVersion());
        dest.setCreatedDate(entity.getCreatedDate());
        dest.setCustomer(customerConvertor.createDTO(entity.getCustomer()));
        dest.setBillingAddress(addressConvertor.createDTO(entity.getBillingAddress()));
        dest.setShippingAddress(addressConvertor.createDTO(entity.getShippingAddress()));
        dest.setServices(serviceConvertor.createFromEntities(entity.getServices()));
        return dest;
    }
}
