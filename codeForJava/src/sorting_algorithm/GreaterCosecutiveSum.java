package sorting_algorithm;

public class GreaterCosecutiveSum {

	public static void main(String[] args) {
		int arr[] = {12,7,6,4,98,23,45,78,90,5,33};
		int k =3 ;
		int sum = 0 ;
		int max ;
		int n = arr.length ;
		
		for(int i =0 ; i< k ;i++) {
			sum = sum + arr[i] ;
			
		}
		
		max = sum ;
		for(int  i= k ; i<n ;i++) {
			sum = sum - arr[i-k] ;
			sum = sum + arr[i] ;
			if(sum > max) {
				max = sum ;
			}
		}
         System.out.println(max);
	}

}
