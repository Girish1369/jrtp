package com.nt.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
    
@Test
public void testWithPositive() {
	int a=10;
	int b=20;
	int expected=30;
	App app=new App();
	int actual=app.add(a, b);
	assertEquals(expected,actual);
}
  
}
