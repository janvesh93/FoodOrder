package com.biryanivibes.model;

import javax.persistence.Entity;


public class Customer extends User {
	
	  public Customer() {
		    this.setType("customer");
		  }

		  public Customer(String userName, String password, String phoneNumber, String address,
		      String city, String state, String zip) {
		   // super(userName, password, phoneNumber, address, city, state, zip);
		    this.setType("customer");
		  }

}
