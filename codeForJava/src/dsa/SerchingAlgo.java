package dsa;

public class SerchingAlgo {

	/***
	public static int search(int arr[] , int k) {
		
		for(int i =0 ; i< arr.length ; i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1 ;
	}
    ***/
	
	// using binary search
	public static int search(int arr[] , int k ) {
		// time complexity -> n + n/2+ n/4 ----n/2 ---log2n =k
		int low = 0 ;
		int high = arr.length -1;
		while(low <= high) {
			int mid = low+(high - low)/2;
			
			if(arr[mid] == k) {
				return mid ;
			}
			if(arr[mid] < k) {
				low = mid+1 ;
			}else {
				high = mid -1 ;
			}
		}
		return -1 ;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,46,89,90,92,93,95,555,924};
		int k = 555 ;
		int ans = search(arr ,k );
		System.out.println(ans);
	}

}
