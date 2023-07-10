package com.gl.empManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gl.empManagement.dao.EmployeeRepository;
import com.gl.empManagement.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping({"/showEmployees","/","list"})
	public ModelAndView showEmployees() {
		ModelAndView mav = new ModelAndView("employees");
		List<Employee> list =employeeRepository.findAll();
		mav.addObject("employees",list);
		return mav;
	}
}
