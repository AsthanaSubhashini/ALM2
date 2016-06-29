package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojos.Customer;


@Configuration
@Repository
public class CustomerDaoImpl {
	
	//Autowiring sessionFactory
	@Autowired
	private SessionFactory sf;
	
	//Persisting the customer object
	@Transactional
	public Customer registerCustomer(Customer c)
	{
		Session sess =  sf.openSession();
		Transaction tx = sess.getTransaction();
		tx.begin();
		sess.persist(c);
		tx.commit();
		return c;
	}
}
