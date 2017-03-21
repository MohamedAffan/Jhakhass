package com.jhakaas.DAO;

import org.springframework.stereotype.Service;

import com.jhakaas.model.UserDetails;

@Service
public interface UserDAO
{
	public boolean insert_User(UserDetails d);
}
