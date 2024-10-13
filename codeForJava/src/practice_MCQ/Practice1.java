package practice_MCQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>() ;
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);list.add(6);
		
			System.out.println(list);
	//without using stream API
			/*
			ArrayList<Integer> even = new ArrayList<>() ;			
			for( Integer i : list) {
				if(i % 2==0) {
					even.add(i);
				}
			}			
			System.out.println(even);
			*/
	//with using stream API
			
			String s ="java ";
			int x =100;
		     
			String alingn = s.format("%-15s",s);
			System.out.print(alingn);
			System.out.print(x);
			
		/***	List<Integer> even = stream.filter(x-> x%2 == 0).collect(Collectors.toList());
			System.out.println(even);
			
		    List<Integer> enn= list.stream().filter(x -> x% 2 ==0 ).collect(Collectors.toList());
			System.out.println(enn);
			
			
			
			List<Integer> greater = list.stream().filter(x -> x> 3).collect(Collectors.toList());
			System.out.println(greater);
			***/
			
			
			
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	public static String arryToString(int [] arr) {
		
		String str = Arrays.toString(arr);
	    str = str.replaceAll(",", " ");
	    str = str.replaceAll(" ", "");
	    str = str.substring(1, str.length()-1);
		return str;
	}
	
	public static void countChar(String str) {
		int count = 0 ;
		String result = str.toLowerCase();
		for(int i =0 ; i< result.length() ; i++) {
			if(result.charAt(i) >='a' && result.charAt(i) <= 'z' )  {
				count++;
			}
		}
		System.out.println(count);
		
	}
	*/
//	public static void main(String[] args) {
//	
//		String str = "Hello";
//		
//		char s [] = str.toCharArray();
//		System.out.println(s);
//		
//		String y ;
//		
//		
//		
//	   
//	}

}
