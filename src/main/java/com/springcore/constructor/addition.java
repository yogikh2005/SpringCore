package com.springcore.constructor;

public class addition {
	private int a;
	private int b;
	
	public addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Construcotre :double,double\n");
	}
	
	public addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Construcotre :int,int\n");
	}
	
	public addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);;
		System.out.println("Construcotre :string,string\n");
	}
	
	
	
	public void sum()
	{	
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("Addition is "+(a+b));
	}
	
}
