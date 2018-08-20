package com.qa.util;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class AccoutnNumberGenerator {

	private int count;
	
	public AccoutnNumberGenerator() {
		count = 10;
	}
	
	public AccoutnNumberGenerator(int count) {
		this.count=count;
	}
	
	public String generate() {
		return RandomStringUtils.randomAlphanumeric(count);
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
