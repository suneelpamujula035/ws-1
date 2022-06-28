package com.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setSalary(rs.getDouble("salary"));
		return e;
	}

}
