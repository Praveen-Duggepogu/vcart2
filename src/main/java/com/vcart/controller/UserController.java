package com.vcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcart.dao.UserDao;
import com.vcart.entity.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	
	@Autowired
	private UserDao userdao;
	
	@PostMapping("/save")
	public boolean saveUser(User user) {
		userdao.save(user);
		return true;
		
	}
	
}
