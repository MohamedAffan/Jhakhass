package com.jhakaas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhakaas.DAO.CategoryDAO;
import com.jhakaas.DAO.ProductDAO;
import com.jhakaas.DAO.SellerDAO;
import com.jhakaas.model.Product;

@Controller
public class ProductController 
{
	@Autowired
	ProductDAO pdao;
	
	@Autowired
	CategoryDAO cdao;
	
	@Autowired
	SellerDAO sdao;

	
	@RequestMapping(value="/Product",method = RequestMethod.POST)
	public String Product(@ModelAttribute("Product")Product d)
	{
		pdao.insert_Product(d);
		System.out.println(d.getProductId());
		System.out.println(d.getProductname());
		return "redirect:/proddisp";
	}
	
	@RequestMapping("/proddisp")
	public ModelAndView dispprod()
	{
		ModelAndView mv=new ModelAndView("addproduct","Product",new Product());
		String productlist = pdao.viewProduct();
		String categorygsonlist = cdao.viewCategory();
		String supplierslist = sdao.viewSupplier();
		mv.addObject("Product",new Product());
		mv.addObject("productlist", productlist);
		mv.addObject("supplierslist", supplierslist);
		mv.addObject("categorymodelobject", categorygsonlist);
		mv.addObject("check", "true");
		return mv;
				
	}
	

}
	