package com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User 
{
	private int empId;
	private String username;
	private String password;	
	private String empType;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId; 
	}
	
	@Column(nullable=false)
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(nullable=false)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(nullable=false)
	public String getEmpType() {
		return empType;
	}
	
	public void setEmpType(String empType) {
		this.empType = empType;
	}

}
