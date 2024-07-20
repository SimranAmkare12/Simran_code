package hashMap;

import java.util.*;


public class frequencyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "acsjgssssscja";
		
		char[] arr = s.toCharArray();
		
		
		
		HashMap<Character , Integer> mp =  new HashMap<>();
		
		System.out.println("Element of array---"+Arrays.toString(arr));
		
		for(char c  : arr) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
					
			}
			else {
				mp.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character,Integer> ekpair : mp.entrySet()) {
			
			System.out.println(ekpair.getKey()+"----->"+ekpair.getValue());
			
		}
			
		
	}

}

/*
 * putIfAbscent
 * remove
 * size
 * putAll
 * setKey
 * EntrySet
 * clear
 * containsKey
 * containsValue
 * 
 * equals-check if the two object are equal or not
 * */
