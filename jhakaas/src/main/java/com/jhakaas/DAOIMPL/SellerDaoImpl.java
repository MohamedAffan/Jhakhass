package com.jhakaas.DAOIMPL;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.jhakaas.DAO.SellerDAO;
import com.jhakaas.model.SellerReg;
import com.jhakaas.model.UserCred;

@Repository
public class SellerDaoImpl implements SellerDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_Seller(SellerReg d) {
		System.out.println("w");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		System.out.println("e");
		UserCred u=new UserCred();
		u.setEmailid(d.getEmailid());
		u.setPassword(d.getPassword());
		u.setRole("ROLE_ADMIN");
		s.save(d);
		s.save(u);
		t.commit();
		System.out.println("l");
		s.close();
		System.out.println("done");
		return false;
	}

	@Override
	public String viewSupplier() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		Transaction t = s.getTransaction();
		t.begin();
		List<SellerReg> categorieslist = s.createQuery("from SellerReg").list();
		Gson g = new Gson();
		String categorylistgson = g.toJson(categorieslist);
		t.commit();
		s.close();
		//System.out.println(categorylistgson);
		return categorylistgson;
	}

}
