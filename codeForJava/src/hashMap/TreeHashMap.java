package hashMap;
import java.util.*;

public class TreeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   TreeMap<Integer, String> map = new TreeMap<>();
		   map.put(1 , " apple") ;
		   map.put(2 , " banana") ;
		   map.put(3 , " grapes") ;
		   map.put(3 , " grapes") ;
		   map.put(4 , " mango") ;
		   map.put(0, null) ;
		   map.put(0, null) ;
		   
		  // System.out.println(map);
		   

		   for(Map.Entry<Integer, String>m : map.entrySet()) {
			   System.out.println(m.getKey()+"---->"+m.getValue());
			   
		   }
		   
		   
	}

}
  // allow only single null value
  //duplicated value not allowed
  //maintain insertion order   ascending order