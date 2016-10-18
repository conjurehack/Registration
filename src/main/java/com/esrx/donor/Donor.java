package com.esrx.donor;

import org.springframework.data.annotation.Id;

public class Donor {
		@Id
	    private String id;
		private String lastname;
		private String firstname;
	    private String title;
	    private String email;
	    private String country;
		private String zipcode;
		private String phone;
		private String password;
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		//donor either donates time for services or donation amount
		private String[] services;
		//should able to take list of days
		private String[] availableDayOfWeek;
		//should able to take list of times
				private String[] availableTimes;
				
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
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
		public String[] getServices() {
			return services;
		}
		public void setServices(String[] services) {
			this.services = services;
		}
		public String[] getAvailableDayOfWeek() {
			return availableDayOfWeek;
		}
		public void setAvailableDayOfWeek(String[] availableDayOfWeek) {
			this.availableDayOfWeek = availableDayOfWeek;
		}
		public String[] getAvailableTimes() {
			return availableTimes;
		}
		public void setAvailableTimes(String[] availableTimes) {
			this.availableTimes = availableTimes;
		}
		
	   
}
