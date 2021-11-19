package com.todo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.Entity.Users;

@Repository
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Users> getUsersList() {

		Session currentSession = sessionfactory.getCurrentSession();

		Query<Users> query = currentSession.createQuery("from Users" , Users.class);

		List<Users> users = query.getResultList();

		return users;
	}

	@Override
	public void addUser(Users users) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		currentSession.saveOrUpdate(users);
		
	}

}
