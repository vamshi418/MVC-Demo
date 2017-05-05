 package com.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvc.model.Person;
import com.mvc.services.PersonService;

import com.mvc.dao.PersonDao;
import com.mvc.model.Person;
import com.mvc.services.PersonService;


@Controller
public class PersonController {
	@Autowired
private PersonService personService;
	
	@RequestMapping("/")
	public String getPersonForm(Model model)
	{
		model.addAttribute("personObj",new Person());//firstname,lastname,email,phone are null
		return "personform";
	}
	//personobj-to read the value from spring form fields
	//person	-to send the values to persondetails.jsp file
	@RequestMapping("/processPersonDetails")//firstname,lastname,email,phone has some values
	public String getPersonDetails(@ModelAttribute(value="personObj")  Person person,Model model)
    {

		   personService.savePerson(person);
		
    	model.addAttribute("person",person);
    	return "persondetails";	    	
	}
	

}
