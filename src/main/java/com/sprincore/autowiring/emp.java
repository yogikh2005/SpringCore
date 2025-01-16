package com.sprincore.autowiring;

public class emp {

	private Address address;

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
