package com.abhi.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Tester {

	@Test  
	public void testFindMax(){  
		assertEquals(4,FindMaximum.findMax(new int[]{1,3,4,2}));  
		assertEquals(-1,FindMaximum.findMax(new int[]{-12,-1,-3,-4,-2}));  
	} 
	
	@Test  
	public void testPrintString(){  
		assertEquals("Hello Abhi",FindMaximum.printString("Abhi"));  
		assertEquals("Hello Ravi",FindMaximum.printString("Ravi"));   
	}
} 

