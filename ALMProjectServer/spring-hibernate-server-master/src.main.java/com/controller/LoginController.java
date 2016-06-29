package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojos.User;
import com.service.TrainingValidationService;

@RestController
public class LoginController 
{
	@Autowired
	private TrainingValidationService tvs;
	
	public LoginController() 
	{
		System.out.println("Login Controller Called");
	}
	
	@CrossOrigin
	@RequestMapping(value="/login",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User validateUser(@RequestBody User user1)/*@RequestParam(value="username") String username, @RequestParam(value="password") String password*/
	{
		System.out.println("username = "+user1.getUsername());
		String role = tvs.validateUser(user1);
		User u = new User();
		u.setEmpType(role);
		return u;
	} 
}
