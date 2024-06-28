package final_keyword_example;


public class Final_variable2 {

	
	final String name1;
	
	Final_variable2 ( String n){
		 
		 this.name1 = n;
	 }
	
	public static void main(String[] args) {
	
		Final_variable2  p = new  Final_variable2 (" simran ");
		 System.out.println(p.name1);
		 
		 //try to set value of final variable
	  //	 p.name1= " nikhil" ;   // compile time error

	}
	
	
}
