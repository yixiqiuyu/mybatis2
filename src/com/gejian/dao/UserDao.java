package com.gejian.dao;

import java.util.List;

import com.gejian.entity.User;

public interface UserDao {
	List<User> findAllUsers();
	User findUserById(int id);
	void insertUser(User user);
	void updateUser(User user);
}
