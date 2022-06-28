package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets_table")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String seatNo;
	private String movieName;
	private String showTime;
	private String theaterName;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket(String seatNo, String movieName, String showTime, String theaterName) {
		super();
		this.seatNo = seatNo;
		this.movieName = movieName;
		this.showTime = showTime;
		this.theaterName = theaterName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", seatNo=" + seatNo + ", movieName=" + movieName + ", showTime=" + showTime
				+ ", theaterName=" + theaterName + "]";
	}
}
