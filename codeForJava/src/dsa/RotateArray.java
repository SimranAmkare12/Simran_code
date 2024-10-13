package dsa;  //reverse through swapping

import java.util.Arrays;

public class RotateArray {
	public static void rotate(int arr[] ,int k ) {
		 int l = arr.length ;
		 if(k > l) {
			 k= k%l ;
		 }
		 arr = reverse(arr, 0 ,l-1); // 7 6 5 4 3 2 1
		 arr = reverse (arr ,0 ,k-1) ; // 5 ,6,7,4,3,2,1
		 arr = reverse(arr,k ,l-1) ; // 5,6,7,1,2,3,4
		 System.out.println(Arrays.toString(arr));
		
	}
	public static int[] reverse(int arr[],int start , int end) {
		//1 2 3 4 5 6 7      7 1 2 3 4 5 6 // 6 7  1 2 3 4 5 // 5 6  7 1 2 3 4 
		//5 6 7 1 2 3 4     k = 3 
		while(start < end) {
			int temp  = arr[start];  //1
			arr[start ] = arr[end] ;
			arr[end] = temp ;
			start++;
			end-- ;
		}
		System.out.println(Arrays.toString(arr));
		return arr ;
	}
	public static void main(String[] args) {   
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println();
		reverse(arr,3,6);
		//rotate(arr,4);
	}

}
