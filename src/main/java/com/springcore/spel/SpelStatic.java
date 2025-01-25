package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelstatic")
public class SpelStatic {

@Value("#{ T(java.lang.Math).sqrt(144) }")
private double z;

@Value("#{T(java.lang.Math).E}")
private double e;

@Value("#{new java.lang.String('Yogi')}")
private String name;

@Override
public String toString() {
	return "SpelStatic [z=" + z + ", e=" + e + ", name=" + name + "]";
}


}
