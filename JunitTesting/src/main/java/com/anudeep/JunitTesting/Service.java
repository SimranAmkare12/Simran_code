package com.anudeep.JunitTesting;

public class Service {

	
	public static int docalculation(int a, int b){
		
		int c =a+b ;
		
		return c;
		
	}
	

	public static int productTwoNumber(int a, int b){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a*b ;
	}
	
	
	public static int divideTwoNumber(int a, int b){
		return a/b ;
	}
	

	public static int sumAnyNumber(int ...num){

         int ans =0 ;
         for(int a: num) {
    	     ans = ans + a ;
          }
    return ans ;
	}
	
	
}
