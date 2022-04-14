package com.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Data
@NoArgsConstructor
public class RequestTest {
    private String name;
    private String phoneNum;
    private Date createDt;
    private Date updateDt;
}
