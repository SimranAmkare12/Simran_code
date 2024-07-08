package collection_framework;
import java.util.*;


public class Array_list_example {

	public static void main(String[] args) {
		
		
		ArrayList<String> arr_str2 = new ArrayList<String>();
		arr_str2.add("apple");
		arr_str2.add("banana");
		arr_str2.add("cherry");
		arr_str2.add("date");
		arr_str2.add("eldercherry");
		
		System.out.println("original arraylist "+arr_str2);
		
		arr_str2.remove(2);
		arr_str2.add(2, "fig");
		System.out.println("modified arraylist "+arr_str2);
		
		if(arr_str2.contains("banana")) {
			arr_str2.clear();
			
		}
		System.out.println("final arraylist "+arr_str2);
		
		   
		System.out.println();
	    System.out.println(">>>>>>>>>>>>>>>Another example" );
	   
		ArrayList<Integer> arr_str = new ArrayList<Integer>();
	    	  
	    	  arr_str.add(10);
	    	  arr_str.add(20);
	    	  arr_str.add(30);    	
	    	  arr_str.add(40);
	    	  arr_str.add(50);
	    	  
	    	  System.out.println(" original Array list "+arr_str);
	    	  
	          System.out.println("reverse arraylist "+arr_str.reversed());
	          
	         
	    	  System.out.println("sorted arrylist ");
	    	  

	}

}
