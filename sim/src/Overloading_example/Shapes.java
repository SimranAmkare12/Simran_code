package Overloading_example;

public class Shapes {

	public static int  calculate_area(int l,int b) {
		return l*b ;
		
	}
	public static double calculate_area(int r) {
		return 2*3.14 *r;
		
	}
	public static double calculate_area(double s) {
		return s*s;
		
	}
	public static void main(String[] args) {
		//Shapes s = new Shapes();
		System.out.println(" Area of circle is "+calculate_area(2) );
		System.out.println(" Area of rectangle is "+calculate_area(2, 3) );
		System.out.println(" Area of Square is "+calculate_area(5.5) );
		
	}

}
