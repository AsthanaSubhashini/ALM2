package com.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Trainer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String name;
	private boolean availability;
	private float trainingConducted;
	
	@ElementCollection
	private List<String> technology =  new ArrayList<String>();
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public float getTrainingConducted() {
		return trainingConducted;
	}
	
	public void setTrainingConducted(float trainingConducted) {
		this.trainingConducted = trainingConducted;
	}
	
	public List<String> getTechnology() {
		return technology;
	}
	
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	
	
	
}
