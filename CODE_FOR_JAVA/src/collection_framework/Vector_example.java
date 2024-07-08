package collection_framework;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;

public class Vector_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    System.out.println(">>>>>>>>>>>>>>>>>>..... Vector example "); 

      Vector<Integer> num = new Vector<>();
      num.add(10);
      num.add(20);
      num.add(30);
      num.add(40);
      num.add(50);
      
      System.out.println(" original "+num);
      num.remove(2);
      num.add(2, 35);
      System.out.println(" modified vector "+num);
      if(num.contains(40)) {
    	  num.clear();
      }
      System.out.println("final vector "+num);
      
   
    	  
    	  
     
      

	
	}

}
