package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class clg {
	private String name;

	@Override
	public String toString() {
		return "clg [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public clg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct 
	public void start()
	{
		System.out.println("Inside the start");		
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Inside the end");
	}
}
