package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	@Override
	public void insert(Student student) {
		String sql = "insert into demo.student1 values(?,?,?)";
		Object arr[] = {student.getRoll_no(), student.getName(), student.getAddress()};
		int noOfUpdatedRows = jdbcTemplate.update(sql, arr);
		System.out.println("Number of rows updated : "+noOfUpdatedRows);
	}
	
//	public DataSource getDataSource()
//	{
//		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
//		String username = "root";
//		String password = "root";
//		DataSource dataSource = new DriverManagerDataSource(url, username, password);
//		return dataSource;	
//	}

}
