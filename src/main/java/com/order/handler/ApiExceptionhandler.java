package com.order.handler;

import com.order.model.dto.ErrorDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionhandler extends ResponseEntityExceptionHandler {

    private ErrorDto CreateApiError(Exception ex, HttpStatus status) {
        ErrorDto errorDto = new ErrorDto();

        errorDto.setMessage(ex.getMessage());
        errorDto.setStatus(status);

        return errorDto;
    }


    protected ResponseEntity<Object> handleExceptionInternal(
        Exception ex,
        Object body,
        HttpHeaders headers,
        HttpStatus status,
        WebRequest request
    ) {
        System.out.println(ex.getMessage() + "/" + status);
        ErrorDto error = CreateApiError(ex, status);
        return super.handleExceptionInternal(ex, error, headers, status, request);
    }


}
