package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.Student;

@Controller
public class StudentController 
{
	@RequestMapping("/getStudentForm")
public String getStudentForm(Model model)
{
	model.addAttribute("student",new Student());
	return "studentform";
	
}

@RequestMapping("/processStudentData")
	public ModelAndView readData(@ModelAttribute(value="student") Student student, Model model)
	{
	return new ModelAndView("studentdetails","student",student);//view name,model attribute
	}
}
