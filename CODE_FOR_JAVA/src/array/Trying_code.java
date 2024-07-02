package array;

import java.util.Arrays;

public class Trying_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //to check weather the number is present 
		int [] arr = { 23, 27 , 64 ,75 , 83 , 24};
		for(int i =0 ;i<arr.length ; i++) {
			if(arr[i] == 83) {
				System.out.println(arr[i]+" yes the number is present !");
			}
			
		}
		
		System.out.println(" ========");
		  //to check weather the number is present or not
		// another way 
		System.out.println("ABCD/////");
		int [] ttt = {27 , 28 ,89, 12,83, 78};
		boolean flg = false ;
		for(int i : ttt) {
			if(i == 83) {
				flg = true ;
				System.out.println("  yes 83 present");
			}
		}
			if(flg == false) {
				System.out.println(" not found...");
		}
	//to check which element have the sum eqaul to the value of k
		System.out.println("===================");
      int  [] ppp = {4,6,71,8,5,3,23};
      int k = 13;
      for(int i =0 ; i<ppp.length ; i++) {
    	  for(int j = i+1 ; j<ppp.length ; j ++) {
    		  if((ppp[i]+ppp[j]) == k) {
    			  System.out.println(ppp[i]+" and "+ppp[j]);
    			 break;
    		  }
    		  
    	  }
      }
      
      Arrays.sort(ppp);
      for(int i =0 ; i<ppp.length ; i++) {
    	  System.out.println(ppp[i]);
      }
     
     System.out.println("=======================");
     
     int [] arr1 = {12,3,4,67,8,13};    //find max and min
   /*  Arrays.sort(arr1);
     for(int i =0 ;i <arr1.length ;i++) {
    	 System.out.print(arr1[i]+" ");
    	 if(arr[i]>=arr[i+1]) {
    		 System.out.println(arr1[i]);
    	 }
     }
   */
     int max = arr[0];
     int min =  arr[0];
     for(int a : arr) {
    	 if(a>max) {
    		 max =a ;
    	 }
    	 if(a<min) {
    		 min = a;
    	 }
     }
      System.out.println(" maxximum number "+max);
      System.out.println("minimum number "+min);
      System.out.println("==============");
      
      int [] arr2 = {812,3,409,67,8,18};
      Arrays.sort(arr2);
//      for(int i =0 ;i <arr2.length ;i++) {
//     	 System.out.print(arr2[i]+" ");
//      }
     // System.out.println(arr2.length[i);
      System.out.println();
      
      
      System.out.println("******************************");
      //int arr1[] = {12,3,6,8,2,4};
}
}
