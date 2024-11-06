package com.Carrier.HibernateDal;

import java.util.List;

import com.Carrier.Entity.workListTableObject;

public interface workListDalInterface {
	void addWork(workListTableObject work);
	void editWork(workListTableObject work);
	void deleteAnnounce(workListTableObject work);
	List<workListTableObject> getWorkById(int id);
	List<workListTableObject> getAll();
	List<workListTableObject> getAllByFilter(workListTableObject work);
}
