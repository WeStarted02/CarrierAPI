package com.Carrier.HibernateDal;

import java.util.List;

import com.Carrier.Entity.ObjectOfTable;

public interface HibernateDalInterface {
	String getUserPasswordById(int id);
	void addUser(ObjectOfTable user);
	String getUserNameById(int id);
	String getUserSurnameById(int id);
	List<ObjectOfTable> getUserPasswordByEmail(String email);
	List<ObjectOfTable> getUserFullById(int id);
	String getUserEmailById(int id);
	String getUserAboutById(int id);
	void updateUserNameById(int id, String  newValue);
	void updateUserSurnameById(int id, String  newValue);
	void updateUserEmailById(int id, String  newValue);
	void updateUserAboutById(int id, String  newValue);
	void updateUserPasswordById(int id, String  newValue);
}
