package com.esrx.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class ServiceTypes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private String serviceId;
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public List<String> getCategories() {
		if(categories==null){
			categories = new ArrayList<String>();
		}
		return categories;
	}
	

	private String serviceName;
	private List<String> categories;
   

}
