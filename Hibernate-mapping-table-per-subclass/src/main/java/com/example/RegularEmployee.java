package com.example;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "R_EMP3")
@PrimaryKeyJoinColumn(name = "RID")
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
