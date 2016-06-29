package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeleteTrainingDao;
import com.pojos.Training;

@Service
@Transactional
public class DeleteService {
	
	@Autowired
	private DeleteTrainingDao del;
	public String deleteTraining(Training training)
	{
		
		System.out.println("Service method ..trng name received as = " +training.getName());
		return del.deleteTraining(training);
		
	}

}
