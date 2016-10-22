package com.esrx.organizations;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.esrx.services.ServiceTypes;

public class Organizations {
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
	private List<ServiceTypes> serviceTypes;
	
	
	public List<ServiceTypes> getServiceTypes() {
		return serviceTypes;
	}
	public void setServiceTypes(List<ServiceTypes> serviceTypes) {
		this.serviceTypes = serviceTypes;
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
