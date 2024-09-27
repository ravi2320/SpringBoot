package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.repository.UserDao;

@Component
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public String saveUser() {
		boolean f = userDao.save();
		if(f) {
			return "Register Succesful";
		}
		
		return "There is a error at server side";
	}
}
