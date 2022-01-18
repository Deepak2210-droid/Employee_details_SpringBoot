package com.java.springBoot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.springBoot.model.CompanyDetails;
import com.java.springBoot.model.Employee;
import com.java.springBoot.model.EmployeeBean;
import com.java.springBoot.repository.Companyrepository;
import com.java.springBoot.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	private EmployeeRepository emprepo;
	
//	@Autowired
//	private Companyrepository crepo;
	
	public EmployeeBean saveEmployee(EmployeeBean emp) {
		Employee empObj=new Employee(emp.getFirstName(),emp.getLastName(),emp.getEmail(),emp.getAddress(),emp.getTelNum(),emp.getPrimarySkill());
		CompanyDetails comObj=new CompanyDetails(emp.getCompanyName(),emp.getSalary(),emp.getDesignation(),emp.getLevel());
		empObj.setCompanyDetails(comObj);
		emprepo.save(empObj);
		return emp;
	
	}
	
	public EmployeeBean getEmployee(Long id) {
	
		Employee eObj=emprepo.getempl(id);
		
		EmployeeBean employeeBean =EmployeeBean.beanUtil(eObj); 
		return  employeeBean;
	}
	
	public List<EmployeeBean> getAllEmployees(){
		List<Employee> listEmp=emprepo.findAll();
		
		List<EmployeeBean> listBean=new ArrayList<EmployeeBean>();
		for(int i=0;i<listEmp.size();i++) {
			listBean.add(EmployeeBean.beanUtil(listEmp.get(i)));
		}
		return listBean;
		
	}
	
	public String updateEmployee(EmployeeBean emp) {
		
		
		 
		Employee eObj=emprepo.getempl(emp.getId());
		eObj.setFirstName(emp.getFirstName());
		eObj.setLastName(emp.getLastName());
		eObj.setEmail(emp.getEmail());
		eObj.setAddress(emp.getAddress());
		eObj.setTelNum(emp.getTelNum());
		
		
		CompanyDetails cObj=eObj.getCompanyDetails();
		cObj.setCompanyName(emp.getCompanyName());
		cObj.setDesignation(emp.getDesignation());
		cObj.setLevel(emp.getLevel());
		cObj.setSalary(emp.getSalary());
		
		eObj.setCompanyDetails(cObj);
		
		emprepo.save(eObj);
		
		return "success";
	
	}
	
	public String deleteEmployee(Long id) {
		
		return String.valueOf(emprepo.deleteEmployee(id));
	}


}
