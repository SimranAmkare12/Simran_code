package Static_example1;

public class Calculator {

	static int num1 ;
	static int num2 ;
	static
	{
		num1 =12;
		num2 =24;
	    System.out.println("static block start executing..");
	}
	public static void main(String[] args) {
		
         
		System.out.println("value are "+num1+" and "+num2);
            System.out.println(" main block");
	}

}
