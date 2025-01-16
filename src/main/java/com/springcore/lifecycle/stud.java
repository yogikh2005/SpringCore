package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class stud  implements InitializingBean,DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public stud(String name) {
		super();
		this.name = name;
	}

	public stud() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "stud [name=" + name + "]";
	}
	


	@Override
	public void afterPropertiesSet() throws Exception 
	{
			System.out.println("Inside afterPropertiesSet");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy stud");
		
	}

	
}
