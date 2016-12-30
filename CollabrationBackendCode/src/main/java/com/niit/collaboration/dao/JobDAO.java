package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.Job;


public interface JobDAO {
	public List<Job>   list();
	public boolean save(Job job);
	public boolean update(Job job);
	public Job get(Job job);
	
	public Job validate(String id,String password);



}
