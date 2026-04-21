package com.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="citizen")
public class Citizen {
	
	@Id
	@Column(name="cid")
	private int citizenId;
	private String citizenName;
	private int citizenAge;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aadharId")
	private Aadhar aadhar;
	
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	public int getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public int getCitizenAge() {
		return citizenAge;
	}
	public void setCitizenAge(int citizenAge) {
		this.citizenAge = citizenAge;
	}
	public Citizen(int citizenId, String citizenName, int citizenAge) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.citizenAge = citizenAge;
	}
	public Citizen(String citizenName, int citizenAge) {
		super();
		this.citizenName = citizenName;
		this.citizenAge = citizenAge;
	}
	
	public Citizen(int citizenId, String citizenName, int citizenAge, Aadhar aadhar) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.citizenAge = citizenAge;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
	    return "Citizen [citizenId=" + citizenId +
	           ", citizenName=" + citizenName +
	           ", citizenAge=" + citizenAge + "]";
	}
	public Citizen() {
		
	}
	
	
	

}
