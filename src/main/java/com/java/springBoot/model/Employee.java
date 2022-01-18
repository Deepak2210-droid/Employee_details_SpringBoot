package com.java.springBoot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="first_name")
	private String firstName;
	@Column(name ="last_name")
	private String lastName;
	private String email;
	private String address;
	private String telNum;
	private String primarySkill;
	private int deleted;
	
	@OneToOne(cascade =CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CompanyDetails companyDetails;
	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee() {
		this.setDeleted(0);
		
	}
	public Employee(String firstName, String lastName, String email,String address,String telNum,String primarySkill) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address=address;
		this.telNum=telNum;
		this.primarySkill=primarySkill;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int flag) {
		this.deleted = flag;
	}
	
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", telNum=" + telNum + ", companyDetails=" + companyDetails + "]";
	}
	
	
	
}
