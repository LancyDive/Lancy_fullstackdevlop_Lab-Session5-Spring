package com.gl.empManagement.service;

import java.util.List;

import com.gl.empManagement.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	void editEmployee(Employee emp);
	
	void createEmployee(Employee emp);
	
	Employee findById(int id);
	
	int deleteById(int id);

}
