package com.gl.empManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.empManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
