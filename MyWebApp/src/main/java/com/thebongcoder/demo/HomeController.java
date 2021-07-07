package com.thebongcoder.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	// @RequestMapping("home")
//	//public String home(HttpServletRequest req)
//	public String home(@RequestParam("name") String myName, HttpSession session)
//	{
//		
////		HttpSession session = req.getSession(); //create object
////		String name = req.getParameter("name");	//data coming from the client
//		System.out.println("Hi "+myName); // print on the console
//		
//		session.setAttribute("name",myName); //add value in the session
//		return "home";
//	}
	@RequestMapping("home") //accepting the request 
	//public ModelAndView home(@RequestParam("aname") String myName)
							
						//Model Object
											//accepting entire object rather than parameters
	
	public ModelAndView home(Mo_class moclass)
	{

	ModelAndView mv = new ModelAndView();
	mv.addObject("obj",moclass); //to send data and specify myName
	mv.setViewName("home");	
	return mv; //replace with model view	
	}

}
