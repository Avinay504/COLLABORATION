package com.niit.collaboration.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaboration.dao.BlogDAO;
import com.niit.collabrationBackEnd.model.Blog;

import java.util.List;

import javax.transaction.Transactional;

@Repository("blogDAO")
@Transactional
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public BlogDAOImpl() {
		super();
	}

	public BlogDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateBlog(Blog blog) {

		Session session = sessionFactory.openSession();
		try {
			session.saveOrUpdate(blog);
			session.flush();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public Blog getBlogById(String blogId) {
		Session session = sessionFactory.openSession();
		return (Blog) session.get(Blog.class, blogId);
	}

	@Transactional
	public boolean delete(String blogId) {
		// TODO Auto-generated method stub
		try {

			Blog blog = getBlogById(blogId);
			sessionFactory.getCurrentSession().delete(blog);
			sessionFactory.getCurrentSession().flush();

			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Transactional
	public List<Blog> getAllBlogs() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Blog ORDER BY blogId ASC");
		List<Blog> blogs = query.list();
		return blogs;
	}

}