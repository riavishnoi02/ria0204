package com.todo.Dao;

import java.util.List;

import com.todo.Entity.Tasks;

public interface TaskDao {

	public List<Tasks> getTasksList();

	public void saveTasks(Tasks tasks);

	public void deleteTasks(int id);

	public Tasks getTasksList(int id);

}
