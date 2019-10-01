package com.ankur.architect.archservice.util;

import com.ankur.architect.archservice.domain.Service;
import com.ankur.architect.archservice.dto.ServiceDTO;

public class ServiceConvertor implements GenericConvertor<Service, ServiceDTO> {

    @Override
    public Service createEntity(ServiceDTO dto) {
        Service dest =new Service();
        dest.setId(dto.getId());
        dest.setVersion(dto.getVersion());
        dest.setCreatedDate(dto.getCreatedDate());
        dest.setPrice(dto.getPrice());
        dest.setServiceCount(dto.getServiceCount());
        dest.setServiceType(dto.getServiceType());
        return dest;
    }

    @Override
    public ServiceDTO createDTO(Service entity) {
        ServiceDTO dest =new ServiceDTO();
        dest.setId(entity.getId());
        dest.setVersion(entity.getVersion());
        dest.setCreatedDate(entity.getCreatedDate());
        dest.setPrice(entity.getPrice());
        dest.setServiceCount(entity.getServiceCount());
        dest.setServiceType(entity.getServiceType());
        return dest;
    }
}
