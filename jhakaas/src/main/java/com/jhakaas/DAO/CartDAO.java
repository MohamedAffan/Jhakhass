package com.jhakaas.DAO;

import org.springframework.stereotype.Service;

import com.jhakaas.model.Cart;

@Service
public interface CartDAO
{
	public boolean insert_Cart(Cart d);
}
