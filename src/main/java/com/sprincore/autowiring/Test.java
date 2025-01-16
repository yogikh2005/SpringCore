package com.sprincore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sprincore/autowiring/configautowiring.xml");
		
		
		
		emp e=context.getBean("E",emp.class);
		
		System.out.println(e);

	}

}