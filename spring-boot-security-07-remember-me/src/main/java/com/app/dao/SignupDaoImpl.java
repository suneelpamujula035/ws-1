package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dto.SignupDto;

@Repository
public class SignupDaoImpl implements SignupDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public String saveUser(SignupDto signupDto) {
		String sql1 = "insert into users values(?,?,?)";
		String sql2 = "insert into authorities values(?,?)";
		int user = jdbcTemplate.update(sql1,signupDto.getUsername(),signupDto.getPassword(),1);
		int authority = jdbcTemplate.update(sql2,signupDto.getUsername(),"user");
		return "Number of users saved : "+user;
	}

}
