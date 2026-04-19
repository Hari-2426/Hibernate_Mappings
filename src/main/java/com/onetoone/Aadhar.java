package com.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="aadhar")
public class Aadhar {
	
	@Id
	private long aadharId;
	private String fatherName;
	
	@OneToOne(mappedBy = "aadhar")
	
	private Citizen citizen;
	
	public long getAadharId() {
		return aadharId;
	}
	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Aadhar(long aadharId, String fatherName) {
		super();
		this.aadharId = aadharId;
		this.fatherName = fatherName;
	}
	public Aadhar() {
		super();
	}
	
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public Aadhar(long aadharId, String fatherName, Citizen citizen) {
		super();
		this.aadharId = aadharId;
		this.fatherName = fatherName;
		this.citizen = citizen;
	}
	@Override
	public String toString() {
	    return "Aadhar [aadharId=" + aadharId +
	           ", fatherName=" + fatherName + "]";
	}
	
	

}
