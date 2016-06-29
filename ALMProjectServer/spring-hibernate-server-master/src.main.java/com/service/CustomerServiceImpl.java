package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDaoImpl;
import com.pojos.Customer;


@Service
@Transactional(readOnly=false)
public class CustomerServiceImpl 
{
	@Autowired
	private CustomerDaoImpl cdao;
		
	public CustomerServiceImpl()
	{
		System.out.println("I too got noticed");
	}
	public Customer registerCustomer(Customer c)
	{
		return cdao.registerCustomer(c);
	}
	
}
