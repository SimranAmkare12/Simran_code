package Exception_handling_exaple;

public class numberFormateException {

	
	
	
	public static void main(String[] args) {
	
   
     
   System.out.println();
   System.out.println(" ");
   String s = "23ff4";
  
        try {
	         int ii = Integer.parseInt(s);
	       System.out.println(ii);
          }
         catch(NumberFormatException e) {
	        // e.printStackTrace();
	         System.out.println( e ); 
            }
   
            System.out.println(" normal flow");
            
            System.out.println();
            System.out.println("===============");
            
            String ss= null ;
          try {
        	  System.out.println(ss.length());
          }
          catch(NullPointerException e) {
        	  System.out.println(e);
          }
            System.out.println(" normal flow");
            

	}

}
