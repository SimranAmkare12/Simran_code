package Exception_handling_exaple;

public class ArrayIndexOutOfBoundsExceptionExample {

	
	public static void main(String[] args) {
		
		   
	     int arr [] = new int [5];
	     arr[0] = 1;
	     arr[1] = 2;
	     arr[2] = 1;
	     arr[3] = 1;
	     arr[4] = 1;
	   
	     try {
	   	   System.out.println(arr[8]);
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println(e);
		    
	     }
	   
	   System.out.println(" Rest of code working normally");
	   
   }
}
