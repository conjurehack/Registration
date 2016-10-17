package com.esrx.volunteer;

import org.springframework.data.annotation.Id;

public class Volunteer {
		@Id
	    private String id;
		private String firstname;
		private String lastname;
	    private String phone;
	    private String email;
	    private String country;
		private String zipcode;
	   
		//need to use crypto to enc/dec passwords
		private String password;
	   
	    
	    public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	    
	    
	  }
