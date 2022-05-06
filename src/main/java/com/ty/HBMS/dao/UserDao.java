package com.ty.HBMS.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.HBMS.dto.User;
@Repository
public class UserDao {
	@Autowired
	EntityManager entityManager;
	@Autowired
	EntityTransaction entityTransaction;
	
	public void saveUser(User user) {
		entityTransaction.begin();
		 entityManager.persist(user);
		 entityTransaction.commit();
	}
	public User getUser(int id) {
		return entityManager.find(User.class, id);
	}
	public List<User> getAllUser(){
	
	return entityManager.createQuery("select u from User u").getResultList();
	}
	public void updateUSer(User user) {
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
	public boolean remove(int id) {
		User user=getUser(id);
		entityTransaction.begin();
		if(user!=null) {
		entityManager.remove(user);
		entityTransaction.commit();
		return true;
		}
		return false;
	}

	public User validate(String email,String password) {
		Query query=entityManager.createQuery("select s from User s where s.email=?1 and s.password=?2");
		 User user = null;
	query.setParameter(1, email);
	query.setParameter(2, password);
	List<User> list=query.getResultList();
	if(list !=null&& list.size()>0) {
		return list.get(0);
	}
	return null;
	}
}
