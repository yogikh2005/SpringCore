package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	@Autowired 
	@Qualifier("test")
	private Address address;

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(@Qualifier("test") Address address) {
		this.address = address;
		System.out.println("Inside setaddress\n");
	}
	
	public emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside contructore");
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
	
}
