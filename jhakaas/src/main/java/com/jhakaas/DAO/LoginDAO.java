package com.jhakaas.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhakaas.model.UserDetails;

@Service
public interface LoginDAO
{
	public List<UserDetails> ListUserDetails();
}
