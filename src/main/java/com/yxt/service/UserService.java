package com.yxt.service;

import com.yxt.dao.T_userDAO;

public class UserService {
	private static UserService instance = new UserService();
	public static UserService getInstance(){
		if(instance == null){
			instance = new UserService();
		}
		return instance;
	}
	
	public T_userDAO getUser(String username){
		return T_userDAO.dao.findFirst("select * from "+T_userDAO.dao.getTable().getName()+" where username = ?",username);
	}
}