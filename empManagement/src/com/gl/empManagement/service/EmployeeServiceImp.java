package com.gl.empManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gl.empManagement.dao.EmployeeRepository;
import com.gl.empManagement.entity.Employee;

public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;


	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public void editEmployee(Employee emp) {
		repository.save(emp);
	}

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repository.save(emp);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = repository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
	}

	@Override
	public int deleteById(int id) {
		repository.deleteById(id);
		return id;
	}
	
}
