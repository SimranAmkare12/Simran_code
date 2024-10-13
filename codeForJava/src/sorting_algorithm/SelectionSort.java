package sorting_algorithm;

import java.util.Arrays;

public class SelectionSort {
 
	public static void printArray(int arr[]) {
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void ascSort(int arr[]) {
		for(int i = 0 ; i< arr.length ;i++) {
			int small =i ;
			for(int j =i+1 ;j < arr.length ;j++) {
				if(arr[small] > arr[j]) {
					small =  arr[j] ;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i ] = temp ;
		}
		System.out.println("Sorted array in Ascending order");
		printArray(arr);
	}
	
	public void de_ascSort(int arr[]) {
		for(int i=0 ; i <arr.length ;i++) {
			int large = i ;
			for(int j = i+1 ;j<arr.length ;j++) {
				if(arr[j] > arr[large]) {
					large = j;
				}
			}
			int temp = arr[i];
			arr[large]  = arr[i] ;
			arr[i] = temp ;
		}
		System.out.println("Sorted array in descending order");
		printArray(arr);
	}
	
	
	public static void main(String[] args) {
		int arr[] = {12,4,5,8,11,0};
		SelectionSort obj = new SelectionSort();
		obj.ascSort(arr);
		obj.de_ascSort(arr);
		
		
	}	
}
