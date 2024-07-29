package com.anudeep.JunitTesting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	////////////////////////////////////////////////
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before each class");
		System.out.println();
	}
	
	///////////////////////////////////////////////////////
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After each class");
		System.out.println();
	}
	
	////////////////////////////////////////////////////////
	
	@Before
	public  void before() {
		System.out.println("This block is execute before each method.");
		
	}
	
	///////////////////////////////////////////////////
	
	@After
	public void after() {
		System.out.println("This block is execute after each method.");
		System.out.println();
	}
	
	////////////////////////////////////////////////////
	
   @Test
	public void  testAdd() {
		
		int exp = 100 ;
		
     	int result	= Calculator.add(50, 50);
		
		Assert.assertEquals( result, exp );
		
	}
   
    ///////////////////////////////////////////////////////
  @Ignore
  public void ignore() {
	  System.out.println("ignored some execution");
  }
  
  /////////////////////////////////////////////////
  @Test
	public void  testProduct() {
		
		int exp = 2500 ;
		
    	int result	= Calculator.product(50, 50);
		
		Assert.assertEquals( result, exp );
	
		
	}
  ///////////////////////////////////////////////////////
 @Test
  public void printTest() {
	  String result = Calculator.print("simran");
	  String exp ="simran";
	  Assert.assertEquals(exp, result);
	 
  }
	
}
