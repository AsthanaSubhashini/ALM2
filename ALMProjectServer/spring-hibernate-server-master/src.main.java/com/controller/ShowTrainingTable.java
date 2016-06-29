package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pojos.Training;
import com.service.ShowTrainingTableService;

@RestController
public class ShowTrainingTable {
	
	@Autowired 
	private ShowTrainingTableService trnTableService;

	public ShowTrainingTable()
	{
		System.out.println("ctor of show training table");
	}
	
	@CrossOrigin
	@RequestMapping(value ="/showtable" , method=RequestMethod.GET , consumes=MediaType.APPLICATION_JSON_VALUE)
	public void showTable()
	{
		//Training trn = new Training();
		System.out.println("controller of show table");
		trnTableService.showTable();
	}
}
