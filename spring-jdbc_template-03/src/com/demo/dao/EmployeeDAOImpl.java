package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;
import com.demo.resultsetextractor.EmployeeResultSetExtractor;
import com.demo.rowmapper.EmployeeRowMapper;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	//@Autowired
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/demo?useSSL=false", "root", "root");
		return dataSource;
	}

	@Override
	public void save(Employee employee) {
		String sql = "insert into demo.employee values (?,?,?)";
		Object arr[] = {employee.getId(), employee.getName(), employee.getSalary()};
		int noOfRecordsInserted = jdbcTemplate.update(sql,arr);
		System.out.println("Number of records inserted : "+noOfRecordsInserted);
	}

	@Override
	public void saveAll(List<Employee> employees) {
		String sql = "insert into demo.employee values (?,?,?)";
		
		List<Object[]> listOfArgs = new ArrayList<>();
		for(Employee emp : employees)
		{
			Object arr[] = {emp.getId(), emp.getName(), emp.getSalary()};
			listOfArgs.add(arr);
		}
		int[] noOfRecordsInserted = jdbcTemplate.batchUpdate(sql,listOfArgs);
		System.out.println("Number of records inserted : "+noOfRecordsInserted);
	}

	@Override
	public Employee get(int id) {
		String sql = "select * from demo.employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(),id);
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		String sql = "select * from demo.employee";
//		List<Employee> employees = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeResultSetExtractor());
		return employees;
	}

	@Override
	public String delete(int id) {
		String sql = "delete from demo.employee where id=?";
		Object arr[] = {id};
		int noOfRecoredsRemobed = jdbcTemplate.update(sql, arr);
		System.out.println("Number of records removed : "+noOfRecoredsRemobed);
		return "Employee is deleted with this id : "+id;
	}

	@Override
	public void update(Employee employee) {
		String sql = "update demo.employee 	set name=? where id=?";
		Object arr[] = {employee.getName(), employee.getId()};
		int noOfRecordsUpdated = jdbcTemplate.update(sql, arr);
		System.out.println("Number of records updated :"+noOfRecordsUpdated);
		
	}

}
