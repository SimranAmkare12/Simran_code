package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      HashMap<String ,Boolean> mp =  new HashMap<>();
		
		mp.put("question_1", true);
		mp.put("question_2", false);
		mp.put("question_3", true);
		mp.put("question_4", true);
		
		
		
		for(Map.Entry<String ,Boolean> s : mp.entrySet()) {
			
			System.out.println(s);
			
		}    
		
		
		
	}

}
