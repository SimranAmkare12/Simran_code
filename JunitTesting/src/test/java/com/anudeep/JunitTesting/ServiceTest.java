package com.anudeep.JunitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ServiceTest {
	
	
	@BeforeClass
	public static void beforeEach() {
		System.out.println("before all test class");
		System.out.println("started test" );
		
	}
	
	
	@AfterClass
	public static void afterEach() {
		System.out.println("After each class");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println(" before har ek k pehele");
	}
	
	
	@Test
	public void doCalculationTest() {               //1
		
		int result = Service.docalculation(12, 12);
		
		int expect_result =24;
		
		Assert.assertEquals(result, expect_result);
		
	}
	@Test
	public void productofTwoNumber() {             //2
		int act = Service.productTwoNumber(12, 12);
		int ext =144 ;
		Assert.assertEquals(ext, act);
	}
	
	@Test
	public void sumAnyNumberTest() {
		int act = (int) Service.sumAnyNumber(2,8,3,4,5);
		int ext = 14;
		Assert.assertEquals(ext, act);
		
	}
	
}
