package com.gejian.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.gejian.entity.User;
import com.gejian.service.UserService;
import com.gejian.service.UserServiceImpl;
import com.gejian.util.MyBatisSqlSessionFactory;

public class TestService {
	@Test
	public void test1(){
		UserService us=new UserServiceImpl();
		List<User> list = us.findAllUsers();
		for(User user:list){
			System.out.println(user);
		}
	}
	@Test
	public void test2(){
		UserService us=new UserServiceImpl();
		User u=us.findUserById(1);
		System.out.println(u);
	}
	@Test
	public void test3(){
		UserService us=new UserServiceImpl();
		User user=new User(2,"hahaha","1234");
		us.insertUser(user);
	}
	@Test
	public void test4(){
		MyBatisSqlSessionFactory ms=new MyBatisSqlSessionFactory();
		SqlSessionFactory sf = ms.getSqlSessionFactory();
		SqlSession s = sf.openSession();
		System.out.println(s);
	}
}
