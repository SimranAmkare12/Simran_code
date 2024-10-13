package sorting_algorithm;
public class Bubble_sort {

	//for printing sorted array array
	public static void printArray(int [] arr) {
		
		for(int i =0 ;i<arr.length ;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//for ascending order
	public  void ascSort(int arr[]) {
		for(int i = 0 ; i<arr.length-1 ;i++) {
			int temp ;
			for(int j =0 ;j< arr.length-1-i ;j++) {
				if(arr[j] > arr[j+1]) {
					temp =arr[j] ;
				    arr[j] = arr[j+1] ;
				    arr[j+1] = temp ;
				}				
			}
		}
		System.out.println("Array in Ascening order");
		printArray(arr);		
		
	}
	// for descending order
	public void de_ascSort(int arr[]) {
		for(int i= 0 ;i <arr.length-1 ;i++) {
			for(int j =0 ;j < arr.length-1-i ;j++) {
				int temp =0 ;
				if(arr[j]  <  arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		System.out.println("Array in Descening order");
		printArray(arr);
	}
	
	public static void main(String[] args) {
		int [] arr = {12,3,4,7,90,5};
		Bubble_sort obj = new Bubble_sort();
		obj.ascSort(arr);
		obj.de_ascSort(arr);
		
	}
}

   //time complexity = n*n