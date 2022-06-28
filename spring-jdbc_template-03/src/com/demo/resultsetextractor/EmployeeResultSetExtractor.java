package com.demo.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.demo.entity.Employee;

public class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> listOfEmployees = new ArrayList<>();
		while(rs.next())
		{
			Employee e = new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setSalary(rs.getDouble("salary"));
			listOfEmployees.add(e);
		}
		return listOfEmployees;
	}

}
