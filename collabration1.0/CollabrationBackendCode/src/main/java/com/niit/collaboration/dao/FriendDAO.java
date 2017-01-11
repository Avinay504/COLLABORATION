package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collabrationBackEnd.model.Friend;


public interface FriendDAO {
	
		public List<Friend>   list();
		public boolean save(Friend friend);
		public boolean update(Friend friend);
		public Friend get(Friend friend);
		
		public Friend validate(String id,String password);



}
