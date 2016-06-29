package com.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.pojos.Training;

@Configuration
@Repository
public interface DeleteTrainingDao {
	
	public String deleteTraining(Training training);

}
