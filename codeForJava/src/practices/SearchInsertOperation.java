package practices;

public class SearchInsertOperation {

	public static int searchInsert(int arr[] , int target) {
		int start = 0 ;
		int end = arr.length-1 ;
		while(start <= end) {    
			int mid = start + (end - start)/2;
			if(mid == target) {
				return mid ;
			}
			else if(mid < target) {
				start = mid+1 ;
			}
			else {
				end = mid -1 ;
			}
		}
		return start ;
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,5};
		int t= 8 ;
		int result =   searchInsert(a,t);
		System.out.println(result);

	}

}
