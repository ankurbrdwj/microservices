package com.ankur.architect.archservice.dto;

import lombok.Data;

import java.util.Date;
@Data
public abstract class AbstractDTO {
    private long id;
    private int version;
    private Date createdDate;
}
