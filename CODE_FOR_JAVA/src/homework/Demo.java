package homework;

public class Demo {

	public static void main(String[] args) {
		
		Demo obj = new Demo() ;
		int arr [] = new int [1000];
		
		try {
			 int x = arr[120000];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(" array out of bound");
		}
		finally {
			System.out.println(" finally block executed");
		}
		arr = null ;
		System.gc();

	}

}
