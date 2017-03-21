package com.jhakaas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhakaas.DAO.UserDAO;
import com.jhakaas.model.UserDetails;

@Controller
public class UserController 
{
	@Autowired
	UserDAO userd;
	
	@RequestMapping("/signup")
	public ModelAndView sinuppage()
	{
		ModelAndView mv=new ModelAndView("signup","reguser",new UserDetails());
		return mv;
	}

	@RequestMapping(value="/userreg",method = RequestMethod.POST)
	public String sinuppage(@ModelAttribute("reguser")UserDetails d)
	{
		userd.insert_User(d);
		return "login";
	}
}
