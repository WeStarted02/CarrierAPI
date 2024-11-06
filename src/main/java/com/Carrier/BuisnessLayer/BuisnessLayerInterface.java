package com.Carrier.BuisnessLayer;

import java.util.List;

import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;

public interface BuisnessLayerInterface {
	String getUserPasswordById(int id);
	void addUser(ObjectOfTable user);
	String getUserNameById(int id);
	String getUserSurnameById(int id);
	String getUserEmailById(int id);
	List<ObjectOfTable> getUserPasswordByEmail(String email);
	String getUserAboutById(int id);
	void updateUserNameById(int id, String  newValue);
	void updateUserSurnameById(int id, String  newValue);
	void updateUserEmailById(int id, String  newValue);
	void updateUserAboutById(int id, String  newValue);
	void updateUserPasswordById(int id, String  newValue);
	void addWork(workListTableObject work);
	void editWork(workListTableObject work);
	void deleteAnnounce(workListTableObject work);
	List<workListTableObject> getWorkById(int id);
	List<workListTableObject> getAll();
	List<ObjectOfTable> getUserFullById(int id);
	List<workListTableObject> getAllByFilter(workListTableObject work);
}
