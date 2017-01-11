package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.Blog;


public interface BlogDAO {
	
		public List<Blog>   list();
		public boolean save(Blog blog);
		public boolean update(Blog blog);
		public Blog get(Blog blog);
		
		public Blog validate(String id,String password);



}
