package com.java.springBoot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springBoot.empservice.EmployeeService;
import com.java.springBoot.model.Employee;
import com.java.springBoot.model.EmployeeBean;

@RestController
@RequestMapping("api/")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	// GETTING THE DETAILS EMPLOYEE WITH SPECIFIED ID(have to work-on ChReq to post)
	@GetMapping("getEmployees/{id}")
	public EmployeeBean getEmp(@PathVariable("id") String id){
		return empService.getEmployeesService(Long.parseLong(id));
	}
	
	// GETTING ALL EMPLOYEE LIST FROM DB
	@GetMapping("getAll")
	public List<EmployeeBean> getAllEmp(){
		System.out.print("getall");
		return empService.getAllEmp();
	} 
	
	// POSTING EMPLOYEE DETAILS TO THE DB
	@PostMapping("postEmployee")
	public EmployeeBean postEmp(@RequestBody EmployeeBean emp) {
		return empService.saveEmployeeService(emp);
	}
	
	// Delete
	@PostMapping("deleteEmployee")
	public String deleteEmployee(@RequestBody String id) {
		System.out.println(id);
		Long id1=Long.parseLong(id.substring(0, 1));
		return empService.deleteEmployeeService(id1);
	}
	
	// Update
	@PutMapping("updateEmployee")
	public String updateEmployee(@RequestBody EmployeeBean emp) {
		return empService.updateEmployeeService(emp);
	}
}
