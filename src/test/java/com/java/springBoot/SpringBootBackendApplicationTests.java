package com.java.springBoot;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.springBoot.model.CompanyDetails;
import com.java.springBoot.model.Employee;
import com.java.springBoot.repository.Companyrepository;
import com.java.springBoot.repository.EmployeeRepository;

@SpringBootTest
class SpringBootBackendApplicationTests {

	@Autowired
	private EmployeeRepository empRepo;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void getAllEmployees() {
		
		Employee emp=new Employee();
		emp.setFirstName("Deepak");
		emp.setLastName("Rajamanickkam");
		emp.setAddress("Namakkal, TamilNadu-637001");
		emp.setEmail("deepak.rajamanickkam@accenture.com");
		emp.setTelNum("9080583510");
		emp.setPrimarySkill("java");
		
		CompanyDetails cmp=new CompanyDetails();
		cmp.setCompanyName("Accenture");
		cmp.setDesignation("Ase");
		cmp.setSalary(28312);
		cmp.setLevel("12");
		
		emp.setCompanyDetails(cmp);
		
		Employee ent=empRepo.save(emp);
		System.out.println(ent);
		
	}
}
