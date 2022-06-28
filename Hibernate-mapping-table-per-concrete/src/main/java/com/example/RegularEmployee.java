package com.example;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "R_EMP")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name="emp_id")),
	@AttributeOverride(name = "name", column = @Column(name="emp_name"))
})
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
