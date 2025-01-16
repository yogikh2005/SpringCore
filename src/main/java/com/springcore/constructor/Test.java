package com.springcore.constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/configconstructore.xml");
		person p=(person)context.getBean("P1");
		
		System.out.print(p);
		
		addition a=(addition)context.getBean("A1");
		a.sum();

	}

}
