package com.Carrier.HibernateDal;


import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Carrier.Entity.ObjectOfTable;
import com.Carrier.Entity.workListTableObject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class workListDal implements workListDalInterface{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void addWork(workListTableObject work) {
		Session session = entityManager.unwrap(Session.class);
	    session.persist(work);
		
	}

	@Override
	@Transactional
	public void editWork(workListTableObject work) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(work);
		
	}

	@Override
	@Transactional
	public void deleteAnnounce(workListTableObject work) {
		Session session = entityManager.unwrap(Session.class);
		session.remove(work);
		
	}

	@Override
	@Transactional
	public List<workListTableObject> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<workListTableObject> works = session.createNativeQuery("Select * FROM Carrier.dbo.work_list",workListTableObject.class).getResultList();
		return works;
	}

	@Override
	public List<workListTableObject> getAllByFilter(workListTableObject work) {
		Session session = entityManager.unwrap(Session.class);
		
		
		StringBuilder query = new StringBuilder("SELECT * FROM Carrier.dbo.work_list WHERE 1=1");

	    if (work.getWorking_time() != null) {
	        query.append(" AND working_time='").append(work.getWorking_time()).append("'");
	    }
	    if (work.getJob_name() != null) {
	        query.append(" AND jobName='").append(work.getJob_name()).append("'");
	    }
	    if (work.getTo_announce_time() != null) {
	        query.append(" AND to_announce_time='").append(work.getTo_announce_time()).append("'");
	    }
	    if (work.getLocation() != null) {
	        query.append(" AND location='").append(work.getLocation()).append("'");
	    }
	    if (work.getTypeof_working() != null) {
	        query.append(" AND typeofWorking='").append(work.getTypeof_working()).append("'");
	    }


		List<workListTableObject> listOgrenciler = session.createNativeQuery(query.toString(), workListTableObject.class).getResultList();
		
		return listOgrenciler;
	}

	@Override
	public List<workListTableObject> getWorkById(int id) {
		Session session = entityManager.unwrap(Session.class);
		List<workListTableObject> workDetail = session.createNativeQuery("Select * FROM Carrier.dbo.work_list where id="+id,workListTableObject.class).getResultList();
		return workDetail;
	}
	
	
}
