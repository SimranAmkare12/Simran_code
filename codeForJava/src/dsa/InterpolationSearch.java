package dsa;

public class InterpolationSearch {
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10,16,19,20,22,33,35,45,49};
		int n = arr.length ;
		int k = 33 ;
		int ans = search(arr , 0 ,n-1 ,k);
		System.out.println(ans);
	}

	public static int search(int[] arr, int low, int high , int k) {
		
		int pos ;
		while(low < high &&  k<= arr[high]) {
			
			pos = low +( (((high-low)/ (arr[high]-arr[low] ))*(k -arr[low]) ));
			if(arr[pos] == k) {
				return pos ;
			}
			if(arr[pos] < k) {
				low = pos+1 ;
			}
			else {
				high = pos -1 ;
			}
			
		}
		
		return 0;
	}

}
