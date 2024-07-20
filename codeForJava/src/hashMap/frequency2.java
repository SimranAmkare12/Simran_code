package hashMap;
import java.util.*;

public class frequency2 {
    // find the frequency of number in given array
	
	public static void main(String[] args) {
		
		int [] arr = {1,3,2,3,1,3,1,4,1,6,5,3,1};
		
		System.out.println("Element of arraylist "+arr);
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int c : arr) {
//		   if(map.containsKey(c)) {
//			   map.put(c, map.get(c)+1) ;
//			   
//		   }
//		   else {
//			   
//			   map.put(c, 1) ;
//		   }
			
			map.put(arr[c], map.getOrDefault(arr[c], 0)+ 1);
			
		}
		
      for( Map.Entry<Integer, Integer> pair  : map.entrySet() ) {
    	  
    	  System.out.println(pair.getKey()+"----->"+pair.getValue());
    	  
      }
		
		
		
	}

}
