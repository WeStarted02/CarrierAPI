package com.Carrier.BuisnessLayer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;
import com.Carrier.HibernateDal.HibernateDalInterface;
import com.Carrier.HibernateDal.workListDalInterface;

@Service
public class BuisnessLayer implements BuisnessLayerInterface {
	private HibernateDalInterface hibernateDal;
	private workListDalInterface workListDal;

	

	public BuisnessLayer(HibernateDalInterface hibernateDal, workListDalInterface workListDal) {
		super();
		this.hibernateDal = hibernateDal;
		this.workListDal = workListDal;
	}

	@Override
	public String getUserPasswordById(int id) {
		String user = hibernateDal.getUserPasswordById(id);
		return user;
	}

	@Override
	public void addUser(ObjectOfTable user) {
		hibernateDal.addUser(user);

	}

	@Override
	public String getUserNameById(int id) {
		String user = hibernateDal.getUserNameById(id);
		return user;
	}

	@Override
	public String getUserSurnameById(int id) {
		String user = hibernateDal.getUserSurnameById(id);
		return user;
	}

	@Override
	public String getUserEmailById(int id) {
		String user = hibernateDal.getUserEmailById(id);
		return user;
	}

	@Override
	public String getUserAboutById(int id) {
		String user = hibernateDal.getUserAboutById(id);
		return user;
	}

	@Override
	public void updateUserNameById(int id, String newValue) {
		hibernateDal.updateUserNameById(id, newValue);

	}

	@Override
	public void updateUserSurnameById(int id, String newValue) {
		hibernateDal.updateUserSurnameById(id, newValue);

	}

	@Override
	public void updateUserEmailById(int id, String newValue) {
		hibernateDal.updateUserEmailById(id, newValue);

	}

	@Override
	public void updateUserAboutById(int id, String newValue) {
		hibernateDal.updateUserAboutById(id, newValue);

	}

	@Override
	public void updateUserPasswordById(int id, String newValue) {
		hibernateDal.updateUserPasswordById(id, newValue);
	}

	@Override
	public void addWork(workListTableObject work) {
		workListDal.addWork(work);
		System.out.print(work);

	}

	@Override
	public void editWork(workListTableObject work) {
		workListDal.editWork(work);

	}

	@Override
	public void deleteAnnounce(workListTableObject work) {
		workListDal.deleteAnnounce(work);

	}

	@Override
	public List<workListTableObject> getAll() {
		return workListDal.getAll();
	}

	@Override
	public List<workListTableObject> getAllByFilter(workListTableObject work) {
		return workListDal.getAllByFilter(work);
	}

	@Override
	public List<ObjectOfTable> getUserFullById(int id) {
		return hibernateDal.getUserFullById(id);
	}

	@Override
	public List<ObjectOfTable> getUserPasswordByEmail(String email) {
		return hibernateDal.getUserPasswordByEmail(email);
	}

	@Override
	public List<workListTableObject> getWorkById(int id) {
		return workListDal.getWorkById(id);
	}

}
