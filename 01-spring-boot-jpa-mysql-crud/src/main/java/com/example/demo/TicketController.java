package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketRepository ticketRepo;
	

	@PostMapping("/bookTicket")
	public Ticket bookTickets(@RequestBody Ticket ticket)
	{
		return ticketRepo.save(ticket);
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets()
	{
		List<Ticket> tickets = ticketRepo.findAll();
		return tickets;
	}
	
	@GetMapping("/getTicket/{id}")
	public Ticket getTicket(@PathVariable Integer id)
	{
//		Optional<Ticket> optionalTicket = ticketRepo.findById(id);
//		Ticket ticket = optionalTicket.orElseThrow(()-> new TicketNotFoundException("Ticket with id number "+id+" does not exists"));
//		return ticket;
//		Ticket ticket = ticketRepo.findById(id).orElseThrow(()-> new TicketNotFoundException("Ticket with id number "+id+" doesn't exists"));
		return ticketRepo.findById(id).orElseThrow(()-> new TicketNotFoundException("Ticket with id number "+id+" doesn't exists"));
	}
	
	@GetMapping("/getTicketByMovieName/{name}")
	public Ticket getTicketByMovieName(@PathVariable String name)
	{
		return ticketRepo.findByMovieName(name);
	}
	
	@GetMapping("/getTicketByShowTime/{time}")
	public Ticket getTicketByShowTime(@PathVariable String time)
	{
		return ticketRepo.findByShowTime(time);
	}
	
	@PutMapping("/updateTicket/{id}")
	public String updateTicket(@PathVariable Integer id, @RequestBody Ticket ticket)
	{
		Ticket existingTicket = ticketRepo.findById(id).orElseThrow(()-> new TicketNotFoundException("Ticket with id number "+id+" doesn't exists"));
		existingTicket.setMovieName(ticket.getMovieName());
		existingTicket.setSeatNo(ticket.getSeatNo());
		existingTicket.setShowTime(ticket.getShowTime());
		existingTicket.setTheaterName(ticket.getTheaterName());
		ticketRepo.save(existingTicket);
		return "Ticket updated successfully with id : "+id;
	}
	
	@DeleteMapping("/deleteTicket/{id}")
	public String deleteTicket(@PathVariable(name = "id") Integer id)
	{
		Ticket ticket = ticketRepo.findById(id).orElseThrow(()-> new TicketNotFoundException("Ticket with id number "+id+" doesn't exists"));
		ticketRepo.deleteById(id);
		return "Ticket successfully deleted with id : "+id;
	}

	
}

