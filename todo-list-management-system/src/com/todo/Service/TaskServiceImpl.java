package com.todo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.Dao.TaskDao;
import com.todo.Dao.UserDao;
import com.todo.Entity.Tasks;
import com.todo.Entity.Users;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskDao taskDao;
	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public List<Tasks> getTasksList() {

		List<Tasks> tasks = taskDao.getTasksList();
		return tasks;
	}

	@Override
	@Transactional
	public void addTask(Tasks tasks) {

		taskDao.saveTasks(tasks);

	}

	@Override
	@Transactional
	public void deleteTask(int id) {

		taskDao.deleteTasks(id);

	}

	@Override
	@Transactional
	public Tasks getTasksList(int id) {

		Tasks tasks= taskDao.getTasksList(id);
		return tasks;

	}



}
