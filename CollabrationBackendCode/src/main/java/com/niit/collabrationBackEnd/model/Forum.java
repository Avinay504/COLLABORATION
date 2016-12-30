package com.niit.collabrationBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="C_FORUM")
@Component
public class Forum {
	
	@Id
	
	private String id;
	
	private String User_id;
	
	private String Topic;
	
	private String Created_date;
	
	public String getId(){
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getTopic() {
		return Topic;
	}
	public void setTopic(String topic) {
		Topic = topic;
	}
	public String getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(String created_date) {
		Created_date = created_date;
	}

}
