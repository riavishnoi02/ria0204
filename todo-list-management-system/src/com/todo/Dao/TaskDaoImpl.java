package com.todo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.Entity.Tasks;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	public List<Tasks> getTasksList() {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		Query<Tasks> query = currentSession.createQuery("from Tasks",Tasks.class);
		
		List<Tasks> tasks = query.getResultList();
		
		return tasks;
		
	}


	@Override
	public void saveTasks(Tasks tasks) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		currentSession.saveOrUpdate(tasks);
		
	}


	@Override
	public void deleteTasks(int id) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		Query<Tasks> query =  currentSession.createQuery("delete from Tasks where id =:taskId");
		query.setParameter("taskId", id);
		
		query.executeUpdate();
		
	}


	@Override
	public Tasks getTasksList(int id) {


		Session currentSession = sessionfactory.getCurrentSession();

		Query<Tasks> query = currentSession.createQuery("from Tasks where id=:taskId",Tasks.class);

		query.setParameter("taskId", id);
		Tasks tasks = query.getSingleResult();

		return tasks;

	}

}
