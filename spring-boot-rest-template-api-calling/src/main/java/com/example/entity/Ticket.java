package com.example.entity;

import lombok.Data;

@Data
public class Ticket {

	private int id;
	private String seatNo;
	private String movieName;
	private String showTime;
	private String theaterName;
}
