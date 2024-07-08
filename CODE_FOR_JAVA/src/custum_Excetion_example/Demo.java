package custum_Excetion_example;

public class Demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" iam in ");
		
		try {
			int a = 12 /12 ;
			System.out.println(" iam first try ");
			try {
				int c= 143/0 ;
				System.out.println(c );
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(" iam exception second ");
			System.out.println(e);
		}
		finally {
			System.out.println(" iam finally");
		}
	}

}
