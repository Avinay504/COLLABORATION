package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.Blog;



public interface BlogDAO {

	public void saveOrUpdateBlog(Blog blog);

	public Blog getBlogById(String blogId);

	public List<Blog> getAllBlogs();
	
	public boolean delete(String blogId);
}