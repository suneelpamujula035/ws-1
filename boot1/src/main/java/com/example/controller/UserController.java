package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

@RestController
public class UserController {

	@GetMapping( value = "/getUser/{userid}",produces = "application/json")
	public ResponseEntity<User> getUser(@PathVariable(name = "userid") int userid)
	{
		if(userid<0)
		{
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
		else if(userid>=100)
		{
			User user = new User();
			user.setId(userid);
			user.setName("Sreenu");
			user.setAddress("Hyderabad");
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping(value = "/saveUser", consumes = "application/json")
	public ResponseEntity<String> saveUser(@RequestBody User user)
	{
//		User u = new User();
//		u.setId(460);
//		u.setName("Santhosh");
//		u.setAddress("Banglore");
		return new ResponseEntity<String>("User added",HttpStatus.CREATED);
	}
}
