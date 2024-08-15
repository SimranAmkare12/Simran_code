package lab16;
import java.util.*;

public class Mismatch_Exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer value--");
		try {
		   Integer input = sc.nextInt();
		   System.out.println("your value is --"+input);
		}
		catch( InputMismatchException e) {
			System.out.println("you enter the mismatch type ");
			System.out.println(e);
		}

	}

}
