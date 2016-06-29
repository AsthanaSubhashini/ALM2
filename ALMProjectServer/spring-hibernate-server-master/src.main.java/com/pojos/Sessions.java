package com.pojos;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Sessions 
{
	
	private int sessionNo;
	private Date startDate;
	private Date endDate;
	private Date startTime;
	private Date endTime;
	private int id;
	private String venue;
	
	public int getSessionNo() {
		return sessionNo;
	}
	public void setSessionNo(int sessionNo) {
		this.sessionNo = sessionNo;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
	
}
