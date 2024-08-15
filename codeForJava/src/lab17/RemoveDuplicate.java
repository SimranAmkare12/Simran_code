package lab17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {


		List<String> fruit = new ArrayList<>();     //creating list of string with duplicate value
		    fruit.add("Banana"); fruit.add("Mango");
		    fruit.add("Apple");  fruit.add("Grapes");
		    fruit.add("Banana");  fruit.add("Papaya");
		    
		    //printing that duplicated list	     
		   	System.out.println("List of fruit with duplicates "+fruit);
	
		    //creating list of stream then using distinct it remove duplicate value
		    List<String> real_fruit = fruit.stream().distinct()
		    		.collect(Collectors.toList());
		    
		    System.out.println("List of fruit without duplicates "+real_fruit);
		

	}

}
