package com.sve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sve.dao.UserDao;
import com.sve.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	public List<User> getAllUser(int begin, int num) {
		return userDao.getAllUser(begin, num);
	}
	public User getById(int id) {
		return userDao.getById(id);
	}
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}
	public int getUserCount() {
		return userDao.getUserCount();
	}

}
