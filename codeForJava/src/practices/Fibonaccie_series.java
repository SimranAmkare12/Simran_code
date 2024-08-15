package practices;
import java.util.*;

public class Fibonaccie_series {
       public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= 0 , b=1,sum =0 ;  
		System.out.println("Enter the number to which you want to create a fibonaccy series");
		int num = sc.nextInt();
		
		System.out.print(a+" "+b+" ");
		for(int i= 2; i<num ; i++) {
			sum = a+ b ;
			System.out.print(sum+" ");
			a= b ;
			 b= sum ;
		}
	}
}
