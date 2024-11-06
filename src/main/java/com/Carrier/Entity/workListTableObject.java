package com.Carrier.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="work_list")
public class workListTableObject {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "company_id")
	private int company_id;
	@Column(name = "salary")
	private int salary;
	@Column(name = "location")
	private String location;
	@Column(name = "job_name")
	private String job_name;
	@Column(name = "working_time")
	private String working_time;
	@Column(name = "typeof_working")
	private String typeof_working;
	@Column(name = "to_announce_time")
	private Date to_announce_time;
	@Column(name = "work_about")
	private String work_about;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getWorking_time() {
		return working_time;
	}
	public void setWorking_time(String working_time) {
		this.working_time = working_time;
	}
	public String getTypeof_working() {
		return typeof_working;
	}
	public void setTypeof_working(String typeof_working) {
		this.typeof_working = typeof_working;
	}
	public Date getTo_announce_time() {
		return to_announce_time;
	}
	public void setTo_announce_time(Date to_announce_time) {
		this.to_announce_time = to_announce_time;
	}
	public String getWork_about() {
		return work_about;
	}
	public void setWork_about(String work_about) {
		this.work_about = work_about;
	}
	
	
	
}
