package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojos.Training;


@Configuration
@Repository
public class DeleteTrainingDaoImpl implements DeleteTrainingDao {
	
	@Autowired 
	private SessionFactory fac;

	@Transactional
	public String deleteTraining(Training training) {
		Session session = fac.openSession();
		Transaction tx = session.beginTransaction();
		
		String name = training.getName();
		String hql = "delete from Training where name =:name";
		session.createQuery(hql).setString("name",name).executeUpdate();
		tx.commit();
		
		System.out.println("Deletion Successful");
		return null;
	}

}
