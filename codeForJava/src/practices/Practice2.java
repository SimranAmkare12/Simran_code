package practices;

import java.util.Scanner;

public class Practice2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("starting of program"+ "");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int length = s1.length() + s2.length() ;
		System.out.println("sum of lenght of two string "+length);
		
		
		if(s1.compareTo(s2) > 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		String str1 = s1.substring(0, 1 ).toUpperCase() + s1.substring(1);
		String str2 = s2.substring(0, 1 ).toUpperCase() + s2.substring(1);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
