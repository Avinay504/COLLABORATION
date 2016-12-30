package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.Forum;


public interface ForumDAO {
	
		public List<Forum>   list();
		public boolean save(Forum forum);
		public boolean update(Forum forum);
		public Forum get(Forum forum);
		
		public Forum validate(String id,String password);



}
