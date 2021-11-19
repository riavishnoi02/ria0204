package com.todo.Service;

import java.util.List;

import com.todo.Entity.Users;

public interface UserService {
	
	public List<Users> getUsersList();

	public void addUser(Users users);

}
