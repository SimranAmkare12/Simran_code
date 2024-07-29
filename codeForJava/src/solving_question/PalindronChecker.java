package solving_question;

import java.util.*;


public class PalindronChecker {	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // creating scanner class's object for taking input
		System.out.println("enter any string..");
		String str = sc.nextLine() ;
		String reverse ="";
	    char arr[] = str.toCharArray();
	     for(int i=arr.length-1 ;i>=0 ;i--) {
	    	reverse = reverse + str.charAt(i);   // reversing our given string
	  
	     }
	   System.out.println("After reversing sttring "+reverse);
	   if(reverse == str) {
		   System.out.println(" String is paliindron");
	   }
	   else {
		   System.out.println("String is not pallindrom");
	   }
	   
	}

		


}

