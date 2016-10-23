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
	private String shelterId;
	private String zipCode;
	
	private int totalBeds;
	private int available;
	private int unavailable;
	
	private String distance;
	private String address;
	private ShelterAmentities shelterAmentities;

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
	
	public String getShelterId() {
		return shelterId;
	}
	public void setShelterName(String shelterId) {
		this.shelterId = shelterId;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getTotalBeds() {
		return totalBeds;
	}
	public void setTotalBeds(int totalBeds) {
		this.totalBeds = totalBeds;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getUnavailable() {
		return unavailable;
	}
	public void setUnavailable(int unavailable) {
		this.unavailable = unavailable;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	
	
}
