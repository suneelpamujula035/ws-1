package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Object> handleProductNotFoundException(ProductNotFoundException pnfe)
    {
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        APIException exception = new APIException(pnfe.getMessage(),notFound, ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        return new ResponseEntity<Object>(exception, notFound);
    }

}
