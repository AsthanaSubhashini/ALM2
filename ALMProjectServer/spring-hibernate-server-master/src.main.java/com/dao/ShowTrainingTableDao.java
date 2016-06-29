package com.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.pojos.Training;


@Configuration
@Repository
public interface ShowTrainingTableDao {
	
	public List<Training> showTable();
	

}
