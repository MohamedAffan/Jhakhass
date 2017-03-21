package com.jhakaas.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhakaas.DAO.LoginDAO;
import com.jhakaas.model.UserDetails;
@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<UserDetails> ListUserDetails() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<UserDetails> list = sessionFactory.getCurrentSession().createQuery("from UserDetails u").list();
		return list;
	}
	
	

}
