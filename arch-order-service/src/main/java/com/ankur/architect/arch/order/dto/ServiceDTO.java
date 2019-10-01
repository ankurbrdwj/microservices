package com.ankur.architect.arch.order.dto;

import com.ankur.architect.arch.order.domain.ServiceType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ServiceDTO extends AbstractDTO{
    private ServiceType serviceType;
    private int serviceCount;
    private BigDecimal price;
}
