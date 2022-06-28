package com.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regular_employee")
public class RegularEmployee extends Employee {

	private int salary;
	private int bonous;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonous() {
		return bonous;
	}
	public void setBonous(int bonous) {
		this.bonous = bonous;
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonous=" + bonous + "]";
	}
}
