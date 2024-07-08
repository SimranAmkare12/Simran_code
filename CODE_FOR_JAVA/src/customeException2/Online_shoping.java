package customeException2;

public class Online_shoping {

	
	static void validate(String dress_name) throws Out_of_stock_Exception{
		   
		   if(dress_name == "lehnga " ) {
			    throw new Out_of_stock_Exception("  currently the dress is not available..\" ");
		   }
		   else {
			   System.out.println(" welcome to shoping ....");
		   }
	   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" custom exception example..");
		String dress_name= "lehnga ";
		try{
			Online_shoping.validate(dress_name);
		}
			
		
		catch(Out_of_stock_Exception ae) {
			
			System.out.println( ae.getMessage() );
			System.out.println(" out of stock  ");
			
		}
		finally{
			System.out.println(" final block ");
		}
		
		System.out.println("Rest of code ");
		
	}
}


