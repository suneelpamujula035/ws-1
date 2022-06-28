package com.example.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Ticket;

@Service
public class TicketService {

//	public static final String GET_ALL_TICKETS_API = "http://localhost:8080/ticket/bookTicket";
//	public static final String SAVE_TICKET_API = "http://localhost:8080/ticket/bookTicket";
//	public static final String GET_TICKET_BY_ID_API = "http://localhost:8080/ticket/getTicket/{id}";
//	public static final String UPDATE_TICKET_BY_ID_API = "http://localhost:8080/ticket/updateTicket/{id}";
//	public static final String DELETE_TICKET_BY_ID_API = "http://localhost:8080/ticket/deleteTicket/{id}";
	
	@Autowired
	private RestTemplate restTemplate;
		
	public Ticket saveTicket(Ticket ticket)
	{
		HttpEntity<Ticket> entity = new HttpEntity<Ticket>(ticket);
		//url, method type, return type, class
		return restTemplate.exchange("http://localhost:8080/ticket/bookTicket", HttpMethod.POST, entity, Ticket.class).getBody();
	}
	public List<Ticket> getAllTickets()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//url, method type, return type, class
		return restTemplate.exchange("http://localhost:8080/ticket/getTickets", HttpMethod.GET, null, List.class).getBody();
	}
	public Ticket getTicketById(int id)
	{
//		HashMap<String, Integer> param = new HashMap<>();
//		param.put("id", id);
		//return restTemplate.getForObject("http://localhost:8080/ticket/getTicket/{id}", Ticket.class, param);
		return restTemplate.exchange("http://localhost:8080/ticket/getTicket/{id}", HttpMethod.GET, null, Ticket.class, id).getBody();
	}
	
	
}
