package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojos.Training;
import com.service.DeleteService;


@RestController
public class DeleteController {
	
	@Autowired
	private DeleteService ds;

	public DeleteController() {
		System.out.println("inside ctor of delete controller");
	}
	
	@CrossOrigin
	@RequestMapping(value="/delete",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void delTrainings(@RequestBody Training training)/*@RequestParam(value="username") String username, @RequestParam(value="password") String password*/
	{
		
		System.out.println("Training to be deleted is: "+training.getName());
		System.out.println("inside delete training method");
		ds.deleteTraining(training);
		/*System.out.println("username = "+user1.getUsername());
		String role = tvs.validateUser(user1);
		User u = new User();
		u.setEmpType(role);
		//u.setUsername("xuyxy");
		return u;*/
	} 
}
