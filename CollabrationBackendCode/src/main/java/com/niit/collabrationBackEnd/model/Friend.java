package com.niit.collabrationBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="C_FRIEND")
@Component
public class Friend {
	
	@Id
	private String User_id;
	
	private String Friend_id;
	
	private String id;
	
	private String status;
	
	private String is_online;
	
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getFriend_id() {
		return Friend_id;
	}
	public void setFriend_id(String friend_id) {
		Friend_id = friend_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIs_online() {
		return is_online;
	}
	public void setIs_online(String is_online) {
		this.is_online = is_online;
	}
	

}
