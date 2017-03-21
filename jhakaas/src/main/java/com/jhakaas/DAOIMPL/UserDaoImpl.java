package com.jhakaas.DAOIMPL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhakaas.DAO.UserDAO;
import com.jhakaas.model.UserCred;
import com.jhakaas.model.UserDetails;

@Repository
public class UserDaoImpl implements UserDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_User(UserDetails d)
	{
		System.out.println("w");
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		System.out.println("e");
		UserCred u=new UserCred();
		u.setEmailid(d.getEmailid());
		u.setPassword(d.getPassword());
		s.save(d);
		s.save(u);
		t.commit();
		System.out.println("l");
		s.close();		
		System.out.println("done");
		return false;
	}

}
