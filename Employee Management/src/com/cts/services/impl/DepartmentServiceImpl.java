package com.cts.services.impl;

import java.util.List;

import com.cts.beans.Department;
import com.cts.beans.Employee;
import com.cts.services.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private List<Employee> emplList;
	private List<Department> deptList;
	@Override
	public boolean create(Department dept) {
		if(get(dept.getId())!=null) {
			return false;
		}
		deptList.add(dept);
		return true;
	}
	@Override
	public boolean delete(int deptId) {
		Department dept=get(deptId);
		if(dept==null) {
			return false;
		}
		deptList.remove(dept);
		return true;
	}
	@Override
	public boolean update(Department dept) {
		if(get(dept.getId())==null) {
			return false;
		}
		delete(dept.getId());
		create(dept);
		return true;
	}
	@Override
	public Department get(int deptId) {
		for(Department dept:deptList) {
			if(dept.getId()==deptId) {
				return dept;
			}
		}
		return null;
	}
	@Override
	public List<Department> get() {
		return deptList;
	}
	@Override
	public boolean addEmployee(int emplId, int DeptId) {
		return false;
	}
	@Override
	public boolean deleteEmployee(int emplId, int DeptId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Employee> getEmployee(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}
}
