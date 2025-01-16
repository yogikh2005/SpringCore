package com.springcore.constructor;

public class Certificate {
	private String name;

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}
	
}
