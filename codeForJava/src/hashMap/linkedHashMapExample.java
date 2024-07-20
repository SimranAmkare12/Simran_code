package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashMap<String, String> country = new LinkedHashMap<>();
		country.put(" India ", " new delhi ");
		country.put(" Japan ", " tokyo ");
		country.put(null, null);
		country.put(null, null);
		country.put(" france ", " paris ");
		country.put(" Japan ", " tokyo ");
		
		
		
		for(Map.Entry<String, String>m : country.entrySet()) {
			
			System.out.println(m);
			
		}
		
	}

}

    //maintain insertion order
    //allow only single null value
   //duplicate value not allowed 
