package com.todo.Service;

import java.util.List;

import com.todo.Entity.Tasks;
import com.todo.Entity.Users;

public interface TaskService {

	public List<Tasks> getTasksList();

	public void addTask(Tasks tasks);

	public void deleteTask(int id);

	public Tasks getTasksList(int id);



}
