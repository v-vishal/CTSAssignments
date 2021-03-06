package com.cts.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.beans.Employee;
import com.cts.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> empList;
	public EmployeeServiceImpl(){
		empList=new ArrayList<Employee>();
	}
	@Override
	public boolean create(Employee empl) {
		if(get(empl.getId())!=null) {
			return false;
		}
		empList.add(empl);
		return true;
	}

	@Override
	public boolean remove(int id) {
			Employee emp=get(id);
			if(emp==null) {
				return false;
			}
			empList.remove(emp);
			return true;
	}
	@Override
	public boolean update(Employee empl) {
		if(get(empl.getId())==null) {
			return false;
		}
		remove(empl.getId());
		create(empl);
		return true;
	}
	

	@Override
	public Employee get(int id) {
		for(Employee empl:empList) {
			if(empl.getId()==id) {
				return empl;
			}
		}
		return null;
	}

	@Override
	public List<Employee> get() {
		return empList;
	}

	@Override
	public void display(Employee empl) {
		System.out.println(empl.getId());
		System.out.println(empl.getName());
		System.out.println(empl.getSalary());
		
	}
	@Override
	public void display(List<Employee> emp) {
		for(Employee empl:empList) {
			System.out.println(empl.getId());
			System.out.println(empl.getName());
			System.out.println(empl.getSalary());
		}
		
	}

}
