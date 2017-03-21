package com.jhakaas.DAOIMPL;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.jhakaas.DAO.CategoryDAO;
import com.jhakaas.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_Category(Category d) {
		System.out.println("w");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(d);
		t.commit();
		System.out.println("l");
		s.close();
		System.out.println("done");
		return false;
	}

	@Override
	public String viewCategory() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		List<Category> categorieslist = s.createQuery("from Category").list();
		Gson g = new Gson();
		String categorylistgson = g.toJson(categorieslist);
		t.commit();
		s.close();
		//System.out.println(categorylistgson);
		return categorylistgson;
	}

}
