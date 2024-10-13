package sorting_algorithm;

import java.util.Arrays;

public class CheckValue {
	//printing the element that sum is equal to k
	public void checkSum(int arr[]) {
		int k=12 ;
        for(int i=0 ;i <arr.length ;i++) {{
       	 for(int j= i+1 ; j <arr.length ;j++) {
       		 if(arr[i] + arr[j] == k) {
       			 System.out.println(arr[i]+" "+arr[j]);
       		 }
       	 }
        }         	 
     }
	}

	public static void main(String[] args) {
		
		  int arr [] = {12,7,6,4,5,33};
		  Arrays.sort(arr);
		  int n = arr.length ;
		  int  l= 0 ; 
		  int r = n - 1 ;
		  int k = 12 ;
		  while(l < r) {
			  if(arr[l] +arr[r] == k) {
				  System.out.println(arr[l]+" "+arr[r]);
				  break;
			  }
			   else if(arr[l] +arr[r] < k){
				  l++;
			  }
			   else {
				   r--;
			   }
		  }
		  
	}
}