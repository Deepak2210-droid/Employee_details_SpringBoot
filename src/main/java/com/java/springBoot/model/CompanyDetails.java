package com.java.springBoot.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class CompanyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(mappedBy = "companyDetails",cascade = CascadeType.ALL,orphanRemoval = true )
	private Employee employee;
	
	private String companyName;
	private int salary;
	private String designation;
	private String level;
	public CompanyDetails() {
		
	}
	public CompanyDetails(String companyName, int salary, String designation, String level) {
		super();
		this.companyName = companyName;
		this.salary = salary;
		this.designation = designation;
		this.level = level;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setEmployee(Employee empId) {
		this.employee = empId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "CompanyDetails [id=" + id + ", employee=" + employee + ", companyName=" + companyName + ", salary="
				+ salary + ", designation=" + designation + ", level=" + level + "]";
	}
	

}
