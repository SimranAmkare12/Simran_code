package lab14;
import java.util.*;

public class Sorting {
	
	public static void sort(int arry[]) {
		
		for(int i=0 ;i< arry.length ; i++) {
			for(int j= i+1  ;  j< arry.length ; j++) {
				int a = 0 ;
				if(arry[i] > arry[j]) {
					 a =arry[i];     
					 arry[i] = arry[j] ;   
					 arry[j] = a ;
				}
			}
			System.out.print(arry[i]+" ");
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the size of array of number ");
		 int size = sc.nextInt();
		 
		 int arry[] = new int[size];
		 System.out.println("enter the element of array  ");
		 for(int i = 0 ;i <size ; i++) {
			 
			  arry[i] = sc.nextInt(); 
			
		 }
	
		 System.out.println("array element before sorting");
			for(int i= 0 ; i < arry.length ; i++) {
				
				System.out.print(arry[i]+ " ");
			}
		 
			System.out.println();
			System.out.println("array element after sorting");
		Sorting.sort(arry);
		
	
	}

}
