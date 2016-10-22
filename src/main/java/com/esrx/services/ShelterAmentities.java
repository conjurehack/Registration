package com.esrx.services;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class ShelterAmentities implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private String id;

	private boolean hasKitchen;
	private boolean hasTransportation;
	private boolean hasBath;
	private boolean hasLaundry;
	
	public boolean isHasLaundry() {
		return hasLaundry;
	}
	public void setHasLaundry(boolean hasLaundry) {
		this.hasLaundry = hasLaundry;
	}
	
	
	public boolean isHasKitchen() {
		return hasKitchen;
	}
	public void setHasKitchen(boolean hasKitchen) {
		this.hasKitchen = hasKitchen;
	}
	public boolean isHasTransportation() {
		return hasTransportation;
	}
	public void setHasTransportation(boolean hasTransportation) {
		this.hasTransportation = hasTransportation;
	}
	public boolean isHasBath() {
		return hasBath;
	}
	public void setHasBath(boolean hasBath) {
		this.hasBath = hasBath;
	}
	

	
   

}
