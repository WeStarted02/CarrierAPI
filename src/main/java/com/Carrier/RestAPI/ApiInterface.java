package com.Carrier.RestAPI;

import java.util.List;

import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;

public interface ApiInterface {
	void addWork(workListTableObject work);

	void editWork(workListTableObject work);
	
	List<ObjectOfTable> getUserPasswordByEmail(String email);
	
	void deleteAnnounce(workListTableObject work);

	List<workListTableObject> getAll();

	List<workListTableObject> getAllByFilter(workListTableObject work);
	
	List<ObjectOfTable> getUserFullById(int id);
	
	List<workListTableObject> getWorkById(int id);
}
