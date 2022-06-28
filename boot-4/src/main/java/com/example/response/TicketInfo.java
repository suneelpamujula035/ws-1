package com.example.response;

public class TicketInfo {

	private String name;
	private String from;
	private String to;
	private String dateOfJourney;
	private String flightId;
	private String ticketPrice;
	private String ticketStatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "TicketInfo [name=" + name + ", from=" + from + ", to=" + to + ", dateOfJourney=" + dateOfJourney
				+ ", flightId=" + flightId + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus + "]";
	}
	
}
