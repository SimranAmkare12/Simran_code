package homework;

public class Calculator {

	 public static int calculateSum(int a, int b) {
		return a + b ;
		
		 
	 }
	 public static double calculateSum(double a, double b, double d) {
		return a + b + d;
		
		 
	 }
	 public static int calculateSum(int arr[]) {
		 
		 int sum = 0;
		 for(int i = 0 ;i<arr.length ; i++) {
			 sum = sum + arr[i];
		 }
		return sum ;
	 }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		System.out.println(" sum of two integer "+Calculator.calculateSum(12, 12));
	
		System.out.println(" sum of three double "+Calculator.calculateSum(2.4, 5.67, 78.0));
		
       System.out.println(" sum of element of array "+	Calculator.calculateSum(arr));
	}

}
