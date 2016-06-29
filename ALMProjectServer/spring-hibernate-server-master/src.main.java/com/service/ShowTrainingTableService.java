package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ShowTrainingTableDao;
import com.pojos.Training;

@Service
@Transactional
public class ShowTrainingTableService {
	
	@Autowired
	private ShowTrainingTableDao trnTableDao;
	
	public List<Training> showTable()
	{
		System.out.println("inside show trn table service");
		trnTableDao.showTable();
		return null;
		
	}
	
	

}
