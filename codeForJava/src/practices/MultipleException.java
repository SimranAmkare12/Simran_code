package practices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter first integers");
			int a = sc.nextInt();
			System.out.println("Enter second integers");
			int b = sc.nextInt();
			int c= a/b;
			System.out.println("Result is "+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
