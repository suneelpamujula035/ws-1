package com.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {

		Student s = new Student();
		s.setRoll_no(rs.getInt("roll_no"));
		s.setName(rs.getString("name"));
		s.setAddress(rs.getString("address"));
		return s;
	}

}
