package com.jhakaas.DAO;

import org.springframework.stereotype.Service;

import com.jhakaas.model.SellerReg;

@Service
public interface SellerDAO
{
	public boolean insert_Seller(SellerReg d);
	
	public String viewSupplier();
}
