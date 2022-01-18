package com.java.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.springBoot.model.Employee;
import com.java.springBoot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}
}
