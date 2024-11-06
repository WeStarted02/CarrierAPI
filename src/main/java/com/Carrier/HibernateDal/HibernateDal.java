package com.Carrier.HibernateDal;

import java.util.List;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository 
public class HibernateDal implements HibernateDalInterface {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	@Transactional
	public void addUser(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
	    session.persist(user);
	}


	@Override
	@Transactional
	public String getUserPasswordById(int id) {
		Session session = entityManager.unwrap(Session.class);
		String user = session.get(ObjectOfTable.class, id).getPassword();
		return user;
	}


	@Override
	@Transactional
	public String getUserNameById(int id) {
		Session session = entityManager.unwrap(Session.class);
		String user = session.get(ObjectOfTable.class, id).getName();
		return user;
	}


	@Override
	@Transactional
	public String getUserSurnameById(int id) {
		Session session = entityManager.unwrap(Session.class);
		String user = session.get(ObjectOfTable.class, id).getSurname();
		return user;
	}


	@Override
	@Transactional
	public String getUserEmailById(int id) {
		Session session = entityManager.unwrap(Session.class);
		String user = session.get(ObjectOfTable.class, id).getEmail();
		return user;
	}


	@Override
	@Transactional
	public String getUserAboutById(int id) {
		Session session = entityManager.unwrap(Session.class);
		String user = session.get(ObjectOfTable.class, id).getAbout();
		return user;
	}


	@Override
	@Transactional
	public void updateUserNameById(int id, String  newValue) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable user = session.get(ObjectOfTable.class, id);
		user.setName(newValue);
		session.merge(user);
	}


	@Override
	@Transactional
	public void updateUserSurnameById(int id, String  newValue) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable user = session.get(ObjectOfTable.class, id);
		user.setSurname(newValue);
		session.merge(user);
		
	}


	@Override
	@Transactional
	public void updateUserEmailById(int id, String  newValue) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable user = session.get(ObjectOfTable.class, id);
		user.setEmail(newValue);
		session.merge(user);
		
	}


	@Override
	@Transactional
	public void updateUserAboutById(int id, String  newValue) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable user = session.get(ObjectOfTable.class, id);
		user.setAbout(newValue);
		session.merge(user);
		
	}


	@Override
	@Transactional
	public void updateUserPasswordById(int id, String  newValue) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable user = session.get(ObjectOfTable.class, id);
		user.setPassword(newValue);
		session.merge(user);
		
	}


	@Override
	@Transactional
	public List<ObjectOfTable> getUserFullById(int id) {
		Session session = entityManager.unwrap(Session.class);
		List<ObjectOfTable> user = session.createNativeQuery("Select * FROM Carrier.dbo.users where id='"+id+"'",ObjectOfTable.class).getResultList();
		return user;
	}


	@Override
	@Transactional
	public List<ObjectOfTable> getUserPasswordByEmail(String email) {
		Session session = entityManager.unwrap(Session.class);
		List<ObjectOfTable> user = session.createNativeQuery("Select * FROM Carrier.dbo.users where email='"+email+"'",ObjectOfTable.class).getResultList();
		return user;
	}

}
