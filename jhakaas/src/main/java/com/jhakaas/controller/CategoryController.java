package com.jhakaas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhakaas.DAO.CategoryDAO;
import com.jhakaas.model.Category;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryDAO cdao;
	
	@RequestMapping("/Category")
	public ModelAndView Categorypage()
	{
		ModelAndView mv=new ModelAndView("Category","addsell",new Category());
		return mv;
	}
	@RequestMapping(value="/Category",method = RequestMethod.POST)
	public String Category(@ModelAttribute("addsell")Category d)
	{
		cdao.insert_Category(d);
		return "CategoryDisplay";
	}
}
	
