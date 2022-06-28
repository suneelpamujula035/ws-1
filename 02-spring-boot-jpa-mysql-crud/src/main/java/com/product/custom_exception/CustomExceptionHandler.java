package com.product.custom_exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<Object> handleProductNotFound(ProductNotFound pnf)
	{
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ApiException apiException = new ApiException(pnf.getMessage(), notFound, ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<Object>(apiException, notFound);
	}
}
