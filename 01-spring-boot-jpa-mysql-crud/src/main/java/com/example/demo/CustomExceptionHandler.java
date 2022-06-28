package com.example.demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(TicketNotFoundException.class)
	public ResponseEntity<Object> handleTicketNotFound(TicketNotFoundException tnfe)
	{
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ApiException apiException = new ApiException(tnfe.getMessage(), notFound, ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		//return new ResponseEntity<String>(tnfe.getMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(apiException, notFound);
	}
}
