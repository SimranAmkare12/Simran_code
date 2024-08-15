package lab19;

public class MethodReference  {
	public static int square(int num) {
		
		return num * num;
	}
	public static void main(String[] args) {
		CalculateSquare calcu = MethodReference :: square ;
		System.out.println(calcu.square(4));	
	}
}

