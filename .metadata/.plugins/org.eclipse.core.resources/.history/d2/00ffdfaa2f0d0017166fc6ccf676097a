package com.jhakaas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController {

	@RequestMapping("/")
	public String gotoindex() {
		return "index";
	}

	@RequestMapping("/first")
	public String gotofirst() {
		return "FIRST";
	}

	@RequestMapping("/login")
	public ModelAndView gotologin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping("/SellerRegistration")
	public String gotSellerRegestration() {
		return "SellerRegistration";
	}
	
	@RequestMapping("/getprod")
	public String gotprod() {
		return "productdisplay";
	}
}