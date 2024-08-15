package lab19;

public class PerformOperation {

	public static void main(String[] args) {
	int a = 12 ;
	int b = 12 ;
	int result ;
		
		ArithmeticOperation sum = (x,y) -> x+y ;   // providing implementation of abstract method
		 result = sum.calculate(a,b);
		System.out.println("Addition of two number is "+result);
		
		ArithmeticOperation sub =(x,y) -> x-y ;     // providing implementation of abstract method
		 result = sub.calculate(a, b);
		System.out.println("Substraction of two number is "+result);
		
		ArithmeticOperation multiply =(x,y)-> x*y ;     // providing implementation of abstract method
		result = multiply.calculate(a, b);
		System.out.println("Multiplication of two number is "+result);
		
		ArithmeticOperation division =(x,y)-> x / y ;      // providing implementation of abstract method
		result = division.calculate(a, b);
		System.out.println("Division of two number is "+result);
		

	}


}
