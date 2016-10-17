package com.esrx.donor;

import org.springframework.data.annotation.Id;

public class Donor {
		@Id
	    private String id;
		private String name;
	    private String title;
	    private String email;
	    private String country;
		private String zipcode;
		//donor either donates time for services or donation amount
		private String services;
		//should able to take list of days
		private String availableDayOfWeek;
		//should able to take list of times
		private String availableTime;
		
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		public String getServices() {
			return services;
		}
		public void setServices(String services) {
			this.services = services;
		}
		public String getAvailableDayOfWeek() {
			return availableDayOfWeek;
		}
		public void setAvailableDayOfWeek(String availableDayOfWeek) {
			this.availableDayOfWeek = availableDayOfWeek;
		}
		public String getAvailableTime() {
			return availableTime;
		}
		public void setAvailableTime(String availableTime) {
			this.availableTime = availableTime;
		}
		public String getDonationDate() {
			return donationDate;
		}
		public void setDonationDate(String donationDate) {
			this.donationDate = donationDate;
		}
		public double getDonationAmount() {
			return donationAmount;
		}
		public void setDonationAmount(double donationAmount) {
			this.donationAmount = donationAmount;
		}
		private String donationDate;
	    private double donationAmount;
	    
	  
	
}
