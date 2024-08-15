package practices;
import java.util.*;

public class Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0 ;
		int min = 0;
		System.out.println("Enter the size for your arry");
		int size = sc.nextInt();
		
		System.out.println("enter the elemnet of array");
		int arry[] = new int[size];
		for(int i=0 ; i<arry.length ; i++) {
			arry[i] = sc.nextInt();
			
		}
		
		System.out.println("Array element are- ");
		for(int i = 0;i<arry.length ;i++) {
			System.out.print(arry[i]+" ");
		}
		
		for(int i= 0 ;i<arry.length ;i++) {
			for(int j =i+1; j<arry.length ;j++ ) {
				if(arry[i] > arry[j]) {
					
				}
			}
		}
		
		
		
	}

}
