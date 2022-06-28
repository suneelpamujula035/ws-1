package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassengerInfo;
import com.example.response.TicketInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is Air India Rest Controller")
public class AirIndiaRestController {

	@ApiOperation("This method is used to book the ticket")
	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo>bookTicket(@RequestBody PassengerInfo passenger)
	{
		//Logic to book ticket
		
		//Send ticket Info
		TicketInfo ticket = new TicketInfo();
		ticket.setName(passenger.getFname()+" "+passenger.getLname());
		ticket.setFlightId(passenger.getFlightId());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTicketStatus("confirmed");
		ticket.setTicketPrice("4500.00 INR");
		return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
	}
}
