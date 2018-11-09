package com.gejian.service;

import java.util.List;

import com.gejian.entity.User;

public interface UserService {
	public List<User> findAllUsers();
	public User findUserById(int id);
	public void insertUser(User user);
	public void updateUser(User user);
}
