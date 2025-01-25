package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel")
public class Spel {
	
	@Value("#{11+21}")
	 private int x;
	@Value("#{1+2}")
	 private int y;
	

	

	@Override
	public String toString() {
		return "Spel [x=" + x + ", y=" + y +"]";
	}
	 

}
