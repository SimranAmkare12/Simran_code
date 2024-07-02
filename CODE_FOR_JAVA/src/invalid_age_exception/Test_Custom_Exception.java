package invalid_age_exception;

public class Test_Custom_Exception {

	   static void validate(int age)throws InvalidAgeEception{
		   
		   if(age < 18 ) {
			    throw new InvalidAgeEception(" age is not valid to vote ");
		   }
		   else {
			   System.out.println(" welcome to vote ....");
		   }
	   }
	
	   
	public static void main(String[] args) {
		
		try {
			Test_Custom_Exception.validate(13);
		}
		catch(InvalidAgeEception e) {
			
			System.out.println(" caught the exception");
			System.out.println(e);
		}
		
		System.out.println(" rest of code....");
	}

}
