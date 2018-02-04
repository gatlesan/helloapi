package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;


@Controller
public class LoginController {

	   @Autowired
	   ApplicationContext context;

	   @RequestMapping(value="/login", method = RequestMethod.GET)
	   @ResponseBody
	    public String showLoginPage(ModelMap model){
	        return "loginpage";
	    }

		@RequestMapping(value="/hello", method = RequestMethod.GET)
		@ResponseBody
		public String hello(ModelMap model){
			System.out.println("Here");
			return "hello ";
	}
	   
	   @RequestMapping(value="/helloworld", method = RequestMethod.GET)
	   @ResponseBody
	    public String helloworld(ModelMap model){
		    System.out.println("Here");
	        return "helloworld ";
	    }
}
