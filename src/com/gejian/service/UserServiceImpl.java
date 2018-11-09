package com.gejian.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;

import com.gejian.dao.UserDao;
import com.gejian.entity.User;
import com.gejian.util.MyBatisSqlSessionFactory;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		try{
			UserDao ud=sqlSession.getMapper(UserDao.class);
			return ud.findAllUsers();
		}finally{
			sqlSession.close();
		}
		//return null;
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		try{
			UserDao ud=sqlSession.getMapper(UserDao.class);
			return ud.findUserById(id);
		}finally{}
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		try{
			UserDao ud=sqlSession.getMapper(UserDao.class);
			ud.insertUser(user);
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
