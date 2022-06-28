package com.demo.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.demo.api.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>>{

	@Override
	public List<Student> extractData(ResultSet res) throws SQLException, DataAccessException {
		
		List<Student> studentsList = new ArrayList();	
		while(res.next())
		{
			Student s = new Student();
			s.setRoll_no(res.getInt("roll_no"));
			s.setName(res.getString("name"));
			s.setAddress(res.getString("address"));
			studentsList.add(s);
		}
		return studentsList;
	}

}
