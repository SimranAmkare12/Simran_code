package streamAPI;
import java.util.*;

public class Mapping {
	
	//List<String> mylist = list.st
	      List<String> list ;
			String new_list ;

	public void uppercase(String list) {
		
		new_list = list
		
	}
	 
	public static void main(String[] args) {
		
	  list = new ArrayList<>();
	   Scanner sc= new Scanner(System.in);
	 
	   System.out.println("Enter the number of string that you want to-");
	   int n = sc.nextInt();
	  
	   System.out.println("Enter the string ");
	          for(int i =0 ; i<= n ; i++) {
	        	  String input = sc.nextLine();
	        	  list.add(input);
	          }
	    System.out.println("entered String");
	    for(String str : list) {
	    	System.out.println(str);
	    }
		   
	 
		
		
	}

}
