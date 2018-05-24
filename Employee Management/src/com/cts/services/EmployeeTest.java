package com.cts.services;

import java.util.ArrayList;
import java.util.List;

import com.cts.beans.Employee;
import com.cts.services.impl.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeService emplService=new EmployeeServiceImpl();
		Employee empl;
		empl= new Employee(101,"Vishal",10000);
		emplService.create(empl);
		empl=new Employee(102,"Rajesh",12000);
		emplService.create(empl);
		Employee emp=emplService.get(101);
		emplService.display(emp);
		emplService.display(empl);
		empl= new Employee(101,"Xavier",100000);
		emplService.update(empl);
		List<Employee> empList=emplService.get();
		emplService.display(empList);
	}

}
