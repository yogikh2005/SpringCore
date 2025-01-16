package com.springcore.primitive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/primitive/config.xml");
        
        stud s=(stud)context.getBean("S1");
        stud s2=(stud)context.getBean("S2");
        stud s3=(stud)context.getBean("S3");
        stud s4=(stud)context.getBean("S4");
        
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

