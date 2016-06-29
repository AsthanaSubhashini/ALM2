package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TrainingDao;
import com.pojos.User;

@Service
@Transactional
public class TrainingValidationService 
{
	@Autowired
	private TrainingDao tdao;
	
	public String validateUser(User user)
	{
		System.out.println(user.getUsername());
		return tdao.validateUser(user);
	}
	
}
