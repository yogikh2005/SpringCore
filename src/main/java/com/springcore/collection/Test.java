package com.springcore.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp e=(Emp)context.getBean("E1");
		
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpCoruse());
		System.out.println(e.getEmpPhones().getClass().getName());
		System.out.println(e.getEmpAddress());
		System.out.println(e.getDB());
		
	}

}
