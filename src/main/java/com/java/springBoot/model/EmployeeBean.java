package com.java.springBoot.model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String telNum;
	private String companyName;
	private int salary;
	private String designation;
	private String level;
	private String primarySkill;
	
	public EmployeeBean() {
		
	}
	public EmployeeBean(Long id, String firstName, String lastName, String address, String telNum, String email, String primarySkill, String companyName,
			int salary, String designation, String level) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.telNum=telNum;
		this.primarySkill=primarySkill;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.firstName+" "+this.lastName+" "+this.email+" "+
				" "+this.salary+" "+this.designation+" "+this.level+" "+this.address;
	}
	
	public static EmployeeBean beanUtil(Employee eObj)
	{
		CompanyDetails cObj=eObj.getCompanyDetails();
		EmployeeBean employeeBean =new EmployeeBean(eObj.getId(),eObj.getFirstName(),eObj.getLastName(),eObj.getAddress(),eObj.getTelNum(),eObj.getEmail(), eObj.getPrimarySkill(),cObj.getCompanyName(),cObj.getSalary(),cObj.getDesignation(),cObj.getLevel());

		return employeeBean;
	}
	
	

}
