package com.todo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.Dao.UserDao;
import com.todo.Entity.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	@Transactional
	public List<Users> getUsersList() {
		List<Users> users = userDao.getUsersList();
		return users;
	}
	
	@Override
	@Transactional
	public void addUser(Users users) {
		
		 userDao.addUser(users);
		
	}

}
