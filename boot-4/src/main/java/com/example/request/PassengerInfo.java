package com.example.request;

public class PassengerInfo {

	private String fname;
	private String lname;
	private String from;
	private String to;
	private String dateOfJourney;
	private String flightId;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	@Override
	public String toString() {
		return "PassengerInfo [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to
				+ ", dateOfJourney=" + dateOfJourney + ", flightId=" + flightId + "]";
	}
	
}
