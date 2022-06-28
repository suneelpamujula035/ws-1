package com.example;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "C_EMP")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name="emp_id")),
	@AttributeOverride(name = "name", column = @Column(name="emp_name"))
})
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
