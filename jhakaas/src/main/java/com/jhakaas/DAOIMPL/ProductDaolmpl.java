package com.jhakaas.DAOIMPL;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.jhakaas.DAO.ProductDAO;
import com.jhakaas.model.Product;

@Repository
public class ProductDaolmpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_Product(Product d) {
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
	public String viewProduct() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		List<Product> productslist = s.createQuery("from Product").list();
		Gson g = new Gson();
		String productslistgson = g.toJson(productslist);
		t.commit();
		s.close();
		return productslistgson;
	}
	
}
