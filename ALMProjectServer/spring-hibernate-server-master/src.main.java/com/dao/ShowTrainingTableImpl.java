package com.dao;

import java.util.List;

import org.apache.catalina.Session;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojos.Training;

@Configuration
@Repository
public class ShowTrainingTableImpl implements ShowTrainingTableDao {
	
	@Autowired
	SessionFactory fac;

	@Transactional
	public List<Training> showTable() {
		System.out.println("inside show dao");
		
		return null;
	}
	

}
