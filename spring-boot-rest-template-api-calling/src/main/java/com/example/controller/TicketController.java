package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ticket;
import com.example.service.TicketService;

@RestController
@RequestMapping("/ticket-client")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping
	public Ticket saveTicket(@RequestBody Ticket ticket)
	{
		return ticketService.saveTicket(ticket);
	}
	@GetMapping
	public List<Ticket> getAllTickets()
	{
		return ticketService.getAllTickets();
	}
	@GetMapping("/{id}")
	public Ticket getTicketById(@PathVariable int id)
	{
		return ticketService.getTicketById(id);
	}
}
