package practices;

public class ArmstrongNumber {
	
	 public static int lenght = 0 ;
	  static int sum = 0 ;
	 
	public static int lenght(int num) {
		while(num > 0) {
			num = num /10 ;
			lenght++;
		}
		return lenght ;
	}
	
	
	public static int power(int r,int l) {
		int power = 1 ;
		for(int i= 1 ; i <= l ;i++) {
			power = power * r;
		}
		return power ;
	}
	
	
	public static  boolean armstrong(int num) {
		int original = num ;
		int l = lenght(num) ;
		
		while(num != 0) {
			int r = num % 10 ; 
			sum = sum + power(r,l); 
			num = num /10 ;
			
		}
		return sum == original;
	}
	

	public static void main(String[] args) {
      int num = 152 ;
      ArmstrongNumber obj = new ArmstrongNumber() ;
      
      
//      int s = armstrong(num) ;
//      System.out.println(s);
//      
//	if(s == obj.armstrong(num)) {
//    	  System.out.println("yes number is armstrong....");
//      }else {
//    	  System.out.println("no number is not armstrong....");
//      }
//    
      
      
      if(true) {
    	  System.out.println("yes number is armstrong....");
      }else {
    	  System.out.println("no number is not armstrong....");
      }

	}

}
