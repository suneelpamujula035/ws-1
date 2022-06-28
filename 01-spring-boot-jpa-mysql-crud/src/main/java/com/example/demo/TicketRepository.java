package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

	Ticket findByMovieName(String movieName);
	
    Ticket findByShowTime(String time);
}
