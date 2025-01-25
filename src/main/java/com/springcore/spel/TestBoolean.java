package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Test")
public class TestBoolean {
	
	@Value("#{8>3}")
	private boolean b;

	@Override
	public String toString() {
		return "TestBoolean [b=" + b + "]";
	}
	
}
