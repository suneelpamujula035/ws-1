package com.demo.autowiring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("octoposeHeart")
	private Heart heart;

//	@Autowired
//	@Qualifier("horseHeart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}
	
	public void check()
	{
		if(heart!=null)
		{
			heart.pump();
			System.out.println("Name of the Animal is : "+heart.getNameOfAnimal());
			System.out.println("Number of Hearts : "+heart.getNoOfHeart());
		}
		else
		{
			System.out.println("You are Dead..");
		}
	}
}
