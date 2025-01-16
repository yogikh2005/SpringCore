package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Demo d=(Demo)context.getBean("D1");
		
		System.out.println(d);
		
		context.registerShutdownHook();
		
		stud s=(stud)context.getBean("S1");
		
		
		System.out.println(s);
		

		
		clg c=(clg)context.getBean("C1");
		
		
		System.out.println(c);
	}

}
