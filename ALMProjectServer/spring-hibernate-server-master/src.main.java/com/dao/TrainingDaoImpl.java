package com.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojos.Customer;
import com.pojos.User;

@Configuration
@Repository
public class TrainingDaoImpl implements TrainingDao
{
		//Autowiring sessionFactory
		@Autowired
		private SessionFactory sf;
		
		
		//Persisting the customer object
		@Transactional
		public String validateUser(User user)
		{
			Session sess =  sf.openSession();
			Transaction tx = sess.getTransaction();
			tx.begin();
			Query q = sess.createQuery("from User u where u.username= :username and password = :password")
					.setParameter("username", user.getUsername())
					.setParameter("password", user.getPassword());
			tx.commit();
			List<User> result = q.list();
			if(result.size()==1)
			{
				System.out.println(" working "+result.get(0).getEmpType());
				return result.get(0).getEmpType();
			}
			else
			{
				System.out.println("Not working");
				user.setEmpType("noemp");
				return user.getEmpType();
			}
		}
}
