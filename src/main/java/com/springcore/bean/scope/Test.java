package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/bean/scope/config.xml");
		
		Student s=context.getBean("S",Student.class);
		
		System.out.println(s);
		System.out.println(s.hashCode());
		
		Student s2=context.getBean("S",Student.class);
		
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		
	}

}
