package com.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Training 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainId;
	private String name;
	private Date startDate;
	private Date stopDate;
	private Date startTime;
	private Date endTime;
	private int vacancy;
	private String location;
	private int duration;
	private int trainingExecId;
	private String type;
	private int trainerId;
	private String targetedAudience;
	
	@ElementCollection
	private List<Integer> traineeempId;

	@ElementCollection
	private List<Sessions> sessions; 
	
	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStopDate() {
		return stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTrainingExecId() {
		return trainingExecId;
	}

	public void setTrainingExecId(int trainingExecId) {
		this.trainingExecId = trainingExecId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTargetedAudience() {
		return targetedAudience;
	}

	public void setTargetedAudience(String targetedAudience) {
		this.targetedAudience = targetedAudience;
	}

	public List<Integer> getTraineeempId() {
		return traineeempId;
	}

	public void setTraineeempId(List<Integer> traineeempId) {
		this.traineeempId = traineeempId;
	}

	public List<Sessions> getSessions() {
		return sessions;
	}

	public void setSessions(List<Sessions> sessions) {
		this.sessions = sessions;
	}

	
	
}
