package com.order.model.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
public class ErrorDto implements Serializable {

    private String message;
    private HttpStatus status;

}
