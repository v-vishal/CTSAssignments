package com.cts.beans;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private int id;
	private String name;
	private List<Employee> emp=new ArrayList<Employee>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
}
