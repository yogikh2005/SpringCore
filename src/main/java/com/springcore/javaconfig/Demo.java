package com.springcore.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
		
		student student=context.getBean("getStudent",student.class);
		System.out.println(student);
		student.study();

	}

}
