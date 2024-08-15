package strong_number;

public class StrongNumber {
	
	static int factorial(int num) {	    // this method will calculate the factorial of number
		int fact = 1 ;
		for(int i = num ; i>=1 ; i--) {
			 fact = fact * i;
		}
		return fact;
	}
	
	
	public  boolean  isStrong(int num) {  // this will check weather the number is strong or not
		int original_num = num ;
		 int sum = 0 ;
		
		while(num > 0) {        // only entering in loop if number is greater than 0
			int  digit = num % 10;	    //it give remainder 
			sum =  sum + factorial(digit);  // calling factorial method that take parameter of remainder
			num = num/10 ;  // it return  quotient 
		}
		return sum == original_num ;	// return true if original number and sum is equal 
	}
	
	

	public static void main(String[] args) {
		 int  num = 145 ;
		StrongNumber obj  = new StrongNumber();
		
		if(obj.isStrong(num)) {  // calling isStrong method 
			System.out.println("yes it is ");    
		}
		else {
			System.out.println(" no it is not");
		}
  
	}

}
