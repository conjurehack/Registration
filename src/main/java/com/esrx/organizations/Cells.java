package com.esrx.organizations;

import org.springframework.data.annotation.Id;

public class Cells {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	private String clientId;
	private String shelterId;

	
	//todo
	private String date;
	
	
	private boolean reserved;
	
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	public String getClientId() {
		return clientId;
	}


	public void setClientId(String clientId) {
		this.clientId = clientId;
	}


	public String getShelterId() {
		return shelterId;
	}


	public void setShelterId(String shelterId) {
		this.shelterId = shelterId;
	}





	public boolean isReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	
}
