package com.niit.collaboration.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collabrationBackEnd.model.User;

public class UserDAOImpl implements UserDAO {
	
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
	  this.sessionFactory=sessionFactory;	
	}

	@Transactional
	public List<User> list() {
		String hql="from User";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
	@Transactional
	public boolean save(User user) {
		try{
			sessionFactory.getCurrentSession().save(user);
			}catch(Exception e){
				return false;
			}
			return true;
		
	}
	@Transactional
	public boolean update(User user) {
		try{
			sessionFactory.getCurrentSession().update(user);
			}catch(Exception e){
				return false;
			}
			return true;
	}
	
	@Transactional
	public User validate(String id, String password) {
        String hql="from User where id= '" + id +"' and password='" +password+"'";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		User user=(User)query.uniqueResult();
		return user;
		
	}

	public User get(String id) {
		User user=(User)sessionFactory.getCurrentSession().get(User.class, id);
		return user;
		
	}

	

	
	
	
	
}
	
	