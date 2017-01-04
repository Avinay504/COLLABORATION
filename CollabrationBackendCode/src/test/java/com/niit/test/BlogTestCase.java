package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.BlogDAO;
import com.niit.collabrationBackEnd.model.Blog;

public class BlogTestCase {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		Blog blog = (Blog) context.getBean("blog");
		BlogDAO blogDAO = (BlogDAO) context.getBean("blogDao");

		// INSERT OBJECTS INTO DB

		blog.setBlogId("BLOG_001");
		blog.setContent("Content");
        blog.setTitle("title");
		blog.setUsersID(389);
		blog.setApproved(0);
		blog.setCategory("this is category");
		blogDAO.saveOrUpdateBlog(blog);

	    context.close();
	}
}