package lab14;
import java.util.*;


public class Sum_Average_of_array {
	
	  static int size ;
	
	static int calculate_sum(int arr[]) {
		int sum =0 ;
		for(int x:arr) {
			sum = sum + x;
		}
		return sum ;
	}
	
	
	static int calculate_avg(int arr[]) {
		
		int avg = calculate_sum(arr) / size ;
		return avg;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //creating object of scanner class to take input
		System.out.println("enter the size  array of number for calculating sum and average");
		
	    size =sc.nextInt();
	    System.out.println("this is the size of array"+size);
	    
	    int arr []= new int[size];
		 
		  for(int i = 0 ;i <size ; i++) {
			 
			  arr[i] = sc.nextInt(); 
			
		 }
		int sum_of_array = Sum_Average_of_array.calculate_sum(arr);
		 System.out.println("sum of array "+sum_of_array);
		 
		 int avg_of_array = Sum_Average_of_array.calculate_avg(arr);
		 System.out.println("average of average "+avg_of_array  );
		 
	}

}
