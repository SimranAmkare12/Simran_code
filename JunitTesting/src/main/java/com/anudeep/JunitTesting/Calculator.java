package com.anudeep.JunitTesting;

import java.util.*;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	////////////////////////////////////////////////////////
	
	public static int add(int a ,int b) {
		
		int c = a + b ;
		
		System.out.println("This is my add ");
		
	    return c;
	}

	/////////////////////////////////////////////////////////
       public static int product(int a ,int b) {
		
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("This is my product ");
		
	        return a*b;
	   }
       
     ///////////////////////////////////////////////////////  
   public static String print(String name) {
	   System.out.println("Enter your name");
	   System.out.println("My name is--"+name);
	   return name ;
   }
   
   
	
}
