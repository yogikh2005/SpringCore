package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(""
				+ "com/springcore/standalone/collections/configalone.xml");
	
		person p=context.getBean("P",person.class);
		
		System.out.println(p.getDb());
		System.out.println(p.getFee());
		System.out.println(p.getFriends());
	}
}
 
