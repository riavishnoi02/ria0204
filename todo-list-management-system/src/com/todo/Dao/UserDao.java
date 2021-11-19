package com.todo.Dao;

import java.util.List;

import com.todo.Entity.Users;

public interface UserDao {

	List<Users> getUsersList();

	void addUser(Users users);

}
