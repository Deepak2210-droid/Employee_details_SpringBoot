package com.java.springBoot.empservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springBoot.dao.EmployeeDao;
import com.java.springBoot.model.Employee;
import com.java.springBoot.model.EmployeeBean;
import com.java.springBoot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	//SaveEmployee
	public EmployeeBean saveEmployeeService(EmployeeBean emp) {
		return this.empDao.saveEmployee(emp);
		
	}
	
	//getEmployee
	public EmployeeBean getEmployeesService(Long id){
		System.out.println("get"); 

		return this.empDao.getEmployee(id);
	}
	
	//getAll
	public List<EmployeeBean> getAllEmp(){
		return empDao.getAllEmployees();
	}
	
	//update
	public String updateEmployeeService(EmployeeBean emp) {
		return empDao.updateEmployee(emp);
	}
	
	//delete
	public String deleteEmployeeService(Long id) {
		
		return empDao.deleteEmployee(id);
	}
	
	
}
