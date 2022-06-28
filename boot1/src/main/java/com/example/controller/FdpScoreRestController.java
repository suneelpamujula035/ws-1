package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fdp")
public class FdpScoreRestController {

	//http://localhost:8080/fdp/score/?ssn=764996645
	//http://localhost:8080/fdp/score?ssn=764996645
	@GetMapping("/score")
	public String getScore(@RequestParam("ssn") Long ssn)//without passing parameters we can't access in this method
	{
		return "Your score is 650";
	}
}
