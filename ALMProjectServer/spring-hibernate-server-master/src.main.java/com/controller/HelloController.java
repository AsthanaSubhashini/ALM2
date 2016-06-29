package com.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.beans.CustomerBean;
import com.pojos.Customer;
import com.pojos.Training;
import com.pojos.User;
import com.service.CustomerServiceImpl;



@RestController
public class HelloController
{
	public HelloController()
	{
		System.out.println("Hi");
	}
	
	@Autowired
	private CustomerServiceImpl csi;
	
	@RequestMapping("/")
	public  String indexPage()
	{
		/*User u = new User();
		u.setEmpId(112);
		u.setEmpType("hello");
		u.setPassword("iamukt");
		u.setUsername("iamukt");
		return u;
		*/
		//return new ModelAndView("registertraining.html");
		return "hello Hibern";
		//return "redirect:/views/registertraining.html"; 
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	ModelAndView addCustomer()
	{ 
		ModelAndView modelView = new ModelAndView("feeddetails");
		return modelView; 
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	ModelAndView addCustomerDetails(@ModelAttribute("customer") CustomerBean customer )
	{
		ModelAndView modelView = new ModelAndView("details");
		Customer c = new Customer();
		c.setName(customer.getName());
		csi.registerCustomer(c);
		System.out.println("csi"+csi);
		modelView.addObject("msg","Successfully added into the database");
		return modelView;
	}
	
	@RequestMapping(value="/registerTraining",method=RequestMethod.POST)
	public @ResponseBody Training registerTrainingDetails(
			@RequestParam(value="name") String trainername, @RequestParam(value="startDate") Date date)
	{
		Training training = new Training();
		System.out.println("Trainer Name: "+trainername+"Date is: "+date);
		training.setName(trainername);
		training.setStartDate(date);
		return training;
	}
}
