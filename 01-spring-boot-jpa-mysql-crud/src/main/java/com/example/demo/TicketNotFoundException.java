package com.example.demo;

public class TicketNotFoundException extends RuntimeException {

	public TicketNotFoundException(String msg) {
		super(msg);
	}
}
