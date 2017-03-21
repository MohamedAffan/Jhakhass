package com.jhakaas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhakaas.DAO.SellerDAO;
import com.jhakaas.model.SellerReg;

@Controller
public class SellerController 
{
	@Autowired
	SellerDAO sdao;
	
	@RequestMapping("/seller")
	public ModelAndView sinuppage()
	{
		ModelAndView mv=new ModelAndView("SellerRegistration","addsell",new SellerReg());
		return mv;
	}

	@RequestMapping(value="/sellerreg",method = RequestMethod.POST)
	public String sinuppage(@ModelAttribute("addsell")SellerReg d)
	{
		sdao.insert_Seller(d);
		return "login";
	}
}
