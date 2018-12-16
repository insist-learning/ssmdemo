package com.sve.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sve.entity.User;
public interface UserDao {
	List<User> getAllUser(@Param("begin")int begin, @Param("num")int num);
	int addUser(User user);
	int updateUser(User user);
	int deleteUser(int id);
	User getById(int id);
	int getUserCount(); 
}
