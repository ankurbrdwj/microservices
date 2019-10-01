package com.ankur.architect.archservice.dto;

import com.ankur.architect.archservice.domain.ServiceType;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ServiceDTO extends AbstractDTO{
    private ServiceType serviceType;
    private int serviceCount;
    private BigDecimal price;
}
