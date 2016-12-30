package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.User;

public interface UserDAO {
	
	public List<User>   list();
	public boolean save(User user);
	public boolean update(User user);
	public User get(String id);
	
	public User validate(String id,String password);


}
