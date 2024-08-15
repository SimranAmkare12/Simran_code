package practices;

import java.util.*;
public class ConvertToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String.......");
		String str = sc.nextLine();
		str = str.substring(0,1).toUpperCase() +str.substring(1, str.length());
		System.out.println(str);
		
	}

}
