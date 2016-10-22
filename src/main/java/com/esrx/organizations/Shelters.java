package com.esrx.organizations;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.esrx.services.ShelterAmentities;

public class Shelters {
	@Id
	private String id;
	
	private String uuid;
	public String getUuid() {
		return id;
	}
	private String shelterName;
	private String zipCode;
	
	private String totalBeds;
	private String available;
	private String unavailable;
	
	private String distance;
	private String address;
	private ShelterAmentities shelterAmentities;
	//bath, kitchen, transportaion, laundry

	private List<Cells> cells;
	
	
	
	
	
	
	public List<Cells> getCells() {
		return cells;
	}
	public void setCells(List<Cells> cells) {
		this.cells = cells;
	}
	public ShelterAmentities getShelterAmentities() {
		return shelterAmentities;
	}
	public void setShelterAmentities(ShelterAmentities shelterAmentities) {
		this.shelterAmentities = shelterAmentities;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
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
