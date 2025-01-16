package com.springcore.lifecycle;

public class Demo {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("setting price");
	}

	@Override
	public String toString() {
		return "Demo [price=" + price + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Inside init");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy");
	}

}
