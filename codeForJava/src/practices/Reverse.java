package practices;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
	
		String reverse ="";
		String str ="simran ";
		for(int i= str.length()-1; i>= 0 ; i--) {
		
			reverse = reverse + str.charAt(i);
		}
     System.out.println(reverse);
     if(reverse == str) {
    	 System.out.println("yes the string is pallindron");
     }
     else {
    	 System.out.println("no the String is not pallindrom");
     }
	}

}
