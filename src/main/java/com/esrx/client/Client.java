package com.esrx.client;

import org.springframework.data.annotation.Id;

public class Client {
	@Id
	private String id;

	//private String uuid;
	private String ssn;
	private String dob;
	private String race;
	private String ethnicity;
	private String gender;
	private String firstName;
	private String lastName;
	private String veteranStratus;
	private String livingSituation;
	private String entryDate;
	private String exitDate;
	private String destination;
	private String personalId;
	private String houseHoldId;
	private String relationshipCd;
	private String clientLocation;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getVeteranStratus() {
		return veteranStratus;
	}
	public void setVeteranStratus(String veteranStratus) {
		this.veteranStratus = veteranStratus;
	}
	public String getLivingSituation() {
		return livingSituation;
	}
	public void setLivingSituation(String livingSituation) {
		this.livingSituation = livingSituation;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getExitDate() {
		return exitDate;
	}
	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public String getHouseHoldId() {
		return houseHoldId;
	}
	public void setHouseHoldId(String houseHoldId) {
		this.houseHoldId = houseHoldId;
	}
	public String getRelationshipCd() {
		return relationshipCd;
	}
	public void setRelationshipCd(String relationshipCd) {
		this.relationshipCd = relationshipCd;
	}
	public String getClientLocation() {
		return clientLocation;
	}
	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}
	
	

	
}
