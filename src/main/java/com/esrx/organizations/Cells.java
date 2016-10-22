package com.esrx.organizations;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Cells {
	@Id
	private String id;
	
	private String clientId;
	private String shelterId;
	
	private Date date;
	
	private boolean available;
	
	
	
}
