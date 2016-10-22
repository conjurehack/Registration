package com.esrx.organizations;

import org.springframework.data.annotation.Id;

public class Organizations {
	@Id
	private String id;

	//private String uuid;
	private String shelterName;
	private String zipCode;
	private String totalBeds;
	private String available;
	private String unavailable;
	private String distance;
	public String getShelterName() {
		return shelterName;
	}
	public void setShelterName(String shelterName) {
		this.shelterName = shelterName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTotalBeds() {
		return totalBeds;
	}
	public void setTotalBeds(String totalBeds) {
		this.totalBeds = totalBeds;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getUnavailable() {
		return unavailable;
	}
	public void setUnavailable(String unavailable) {
		this.unavailable = unavailable;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	
	
}
