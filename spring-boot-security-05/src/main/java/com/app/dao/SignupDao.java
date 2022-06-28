package com.app.dao;

import com.app.dto.SignupDto;

public interface SignupDao {

	public String saveUser(SignupDto signupDto);
}
