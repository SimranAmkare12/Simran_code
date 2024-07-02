package Exception_handling_exaple;

import java.util.Scanner;

public class ArithmaticExceptionExample {
	
	public static void check() {
		System.out.println(" check");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
   System.out.println(" enter value of a ");
   int a = sc.nextInt();
   
   System.out.println(" enter value of b ");
   int b = sc.nextInt();
   try {
	   int c = a/b ; 
   }
   catch(ArithmeticException e) {
	   
	   System.out.println(e);
   }

}
}
