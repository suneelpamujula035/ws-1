package com.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contract_employee")
public class ContractEmployee extends Employee {

	private int payPerHour;
	private int time_Hour;
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getTime_Hour() {
		return time_Hour;
	}
	public void setTime_Hour(int time_Hour) {
		this.time_Hour = time_Hour;
	}
	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", time_Hour=" + time_Hour + "]";
	}
	
}
