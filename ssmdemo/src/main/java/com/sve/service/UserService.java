package com.sve.service;

import java.util.List;

import com.sve.entity.User;

public interface UserService {
	public List<User> getAllUser(int begin,int num);
	public User getById(int id);
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
	public int getUserCount(); 
}
