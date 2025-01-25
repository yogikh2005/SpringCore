package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;


public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Spel spel=context.getBean("spel",Spel.class);
		
		System.out.println(spel );
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		SpelExpressionParser sp=new SpelExpressionParser();
		Expression ep=sp.parseExpression("11+21");
		System.out.println(ep.getValue());
		
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		SpelStatic spels=context.getBean("spelstatic",SpelStatic.class);
		System.out.println(spels);
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		TestBoolean test=context.getBean("Test",TestBoolean.class);
		System.out.println(test);
	}

}
