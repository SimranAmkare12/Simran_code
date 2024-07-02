package array;

public class Practice_of_Array {

	public static void main(String[] args) {
		
		int [] arr1 = new int[5];                   //creating array
		arr1[0] =12;
		arr1[1] =24;
		arr1[2] =36;
		arr1[3] =48;
		arr1[4] =60;
		for(int i =0 ;i<5 ; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();                           //creating array in another way
		System.out.println("=======================");
		int [] arr2 = {11,22,33,44,55};
		for(int i =0 ;i<5 ; i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println();                   //         check weather is divisible by 2 or not
		System.out.println("=======================");
		int [] arr3 = {3,6,9,12,15,18};
		for(int i =0 ;i<arr3.length ; i++) {
			if(arr3[i] % 2 == 0) {
				System.out.println(arr3[i]+" Yes the number is divisible by 2");
			}
			else
			{
				System.out.println(arr3[i]+" number is not didvisible by 2");
			}
		}
		
		System.out.println();                           //check weather number is present or not
		System.out.println("=======================");
		int [] arr4 = { 2,4,6,8,10,12,14};
		boolean flg = false ;
		for(int i = 0; i<arr4.length ;i++) {
			if(arr4[i]== 180 ) {
				flg = true ;
				System.out.println(" yes the number is present");
			}
		}
	if(flg==false) {
		System.out.println(" number is not present ");
	}
		
	System.out.println();                           //check that which 2 element of array give sum of k
	System.out.println("=======================");
	int arr5[] = {4,8,12,16,20,24,28};
	int  k =12 ;
	for(int i =0 ;i<arr5.length ; i++) {
		for(int j = 1 ; j<arr5.length ; j++) {
			if(arr5[i]+arr5[j] == k) {
				System.out.println("The number tha make sum equal to "+k);
				System.out.println(arr5[i]+" and "+arr5[j]);
				break;
			}
		}
	}
	
	System.out.println();                                //produce array in reverse order
	System.out.println("=======================");
	System.out.println("Array in normal order ...");
	int arr6[] = {8,16,24,32,40,48};
	for(int i=0 ; i<arr6.length ; i++) {
		System.out.print(arr6[i]+" ");
	}
	System.out.println();
	System.out.println("Array in reverse order....");
	for(int i= arr6.length-1 ;i > 0 ; i--) {
		System.out.print(arr6[i]+" ");
	}
	
	
	System.out.println();
	System.out.println("=======================");
	
	
	
		
		/////end of code
	}

}
