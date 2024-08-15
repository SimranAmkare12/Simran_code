package calculator;
import java.util.*;

public class Calculator_Exception {
	
	

		Scanner sc = new Scanner(System.in);

		int  num1 , num2 ;
		int choice ;
		int result;
		public  void enterValue() {

			System.out.println("Enter 1st number");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
			num2 = sc.nextInt();
		}

		public void calculate() {
			while(true) {

				System.out.println("1 -Addition \n2 -Substraction \n3 -Multiplication \n4 -Division \n5 -Exit" );
				System.out.println("Enter your choice");
			try {
				choice = sc.nextInt() ;
				
			}catch(InputMismatchException e) {
				
				System.out.println("Invalid input. Please enter integers only.");
				sc.nextLine();
				continue ;
				
			}

				switch( choice) {
				case 1:{
					enterValue();
					result = num1 + num2 ;
					System.out.println("Addition of two numbers :"+result);
					break;
				}
				case 2:{
					enterValue();
					result = num1 - num2 ;
					System.out.println("Substraction of two numbers :"+result);
					break;
				}
				case 3:{
					enterValue();
					result = num1 * num2 ;
					System.out.println("Multiplication of two numbers :"+result);
					break;
				}
				case 4:{
					enterValue();
					try {
						result = num1 / num2 ;
					}
					catch(ArithmeticException e) {
						System.out.println("Division by zero is not allowed");
					}
				
					System.out.println("Division of two numbers :"+result);
					break;
				}
				case 5 :{

					System.out.println("Bye Bye");

					System.exit(0);

				}
				default :{
					System.out.println("Please choose a valid option");
				}

				}
			}

		}

		public static void main(String[] args) {


			System.out.println("WELCOME - HERE YOU CAN CALCULATE");
			Calculator_Exception obj = new Calculator_Exception ();
			obj.calculate();
		
		}

	


}
