package com.springcore.autowiring;

public class Address {
	private String city;
	private String street;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	public void setStreet(String street) {
		this.street = street;
	} 
}
