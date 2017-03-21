package com.jhakaas.DAO;

import org.springframework.stereotype.Service;

import com.jhakaas.model.Category;

@Service
public interface CategoryDAO
{
	public boolean insert_Category(Category d);
	
	public String viewCategory();
}
