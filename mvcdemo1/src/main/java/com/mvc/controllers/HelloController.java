
package com.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{
   @RequestMapping("/hello")
	public String helloPage()
   {
		return "helloPage";
	}
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcomepage";
	}
	@RequestMapping("/getUserForm")
	public String getUserForm() 
	{
		return "sayHelloToUser";
		
	}
	
	@RequestMapping("/helloUser")
	public String sayHelloToUser(HttpServletRequest request,Model model)
	{
		String name=request.getParameter("name");
		model.addAttribute("message","welcome"+name);
		return "welcomepage";
	}
	
	
	@RequestMapping("/personform")
	public String personForm()
	{
		return "personform";
	}
}