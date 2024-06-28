package array;

public class Multi_dimention_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" coding...");
		int [][] mat = new int[3][3];
		int count = 1;
		for(int i=0 ; i<3 ;i++) {
			for(int j =0 ; j<3 ;j++) {
				mat[i][j] = count++;
				//System.out.print(mat[i][j]+" ");
			}
			//System.out.println();
		}
		for(int i =0 ;i  < 3 ;i++) {
			for(int j = 0 ;j<3 ;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("===========================");
		for(int i=0 ; i<3 ;i++) {
			for(int j =0 ; j<3 ;j++) {
		System.out.print(mat[i][j]+" ");
      	}
			System.out.println();
		}		
		//print even number
		System.out.println("");
		System.out.println("===========================");
		int [][]arr2 = { {2,3,5},{6,7,2},{2,4,8} };
		for(int i=0 ;i< 3 ;i++) {
			for(int j =0 ; j<3  ;j++) {
				if(arr2[i][j] % 2 ==0) {
					System.out.print(arr2[i][j]+" ");
				}
				
			}
			System.out.println();
		}
		
		//adding 1 to each element..
		System.out.println("");
		System.out.println("===========================");
		int [][]arr3 = { {1,2,3},{4,5,6},{7,8,9} };
		for(int i=0 ;i< 3 ;i++) {
			for(int j =0 ; j<3  ;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("after adding 1 to each elemment..");
		for(int i=0 ;i< 3 ;i++) {
			for(int j =0 ; j<3  ;j++) {
				System.out.print(arr3[i][j]+1+ " ");
			}
			System.out.println();
		}
		
		//adding 1 to each elemnt of row in rectangle
		
		System.out.println(" ");
		System.out.println("===========================");
		int [][]arr4 = { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };
		for(int i=0 ;i< 4 ;i++) {
			for(int j =0 ; j<3 ;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("after adding 1 to each elemment..(Rectangle)");
		for(int i=0 ;i< 4 ;i++) {
			for(int j =0 ; j<3  ;j++) {
				System.out.print(arr4[i][j]+1+ " ");
			}
			System.out.println();
		}
		
		
		// for transpose
		System.out.println(" ");
		System.out.println("===========================");            //doubt
		System.out.println("Transpose matrix ");
		int [][]arr5 = { {4,5,6},{7,8,9},{10,11,12} };
		int transpose[][]=new int [3][3];
		for(int i=0 ;i< 3 ;i++) {
			for(int j =0 ; j<3 ;j++) {
			 transpose[i][j]= arr5[j][i];
				System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("after transpose..");
		for(int  i = 0 ; i<3 ;i++) {
			for(int j = 0 ; j<3 ; j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//for reverse
		System.out.println(" ");
		System.out.println("===============");
		System.out.println("inverse matrix....");
		int arr6 [] [] = { {2,4,6},{6,8,10},{12,14,16}};
		for(int i = 0 ; i<3;i++) {
			for(int j =0 ; j<3 ;j++) {
				System.out.print(arr6[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" inrevers");
		
//
//		for(int i = 3 ; i>=0 ; i--) {
//			for(int j = 0; j<4; j++) {
//				System.out.print(arr6[j][i]+" ");
//			}
//		
//		}
//		
             // for Circular traverse 
		System.out.println();
		System.out.println("=================");
		System.out.println(" for N traverse");
		int arr7 [][] = { {1,2,3},{4,5,6},{7,8,9}};
		for(int  i =0 ; i<arr7.length ; i++) {
			for(int j = 0 ;j<arr7.length ; j++) {
				System.out.print(arr7[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" after Z traverse ");//traverse top row
		for(int j = 0 ; j<arr7.length ;j++) {
			System.out.print(arr7[0][j]+" ");
		}
	
		for(int i =0 ;i<arr7.length-1 ; i++) {  //traverse diagonal from top right to bottom left
			System.out.print(arr7[i][arr7.length-1-i]+" ");
		}
		for(int j = 0 ; j<arr7.length ;j++) {  // traverse the bottom row
			System.out.print(arr7[arr7.length-1][j]+" ");
		}
		
		
		
		System.out.println("");                                   //doubt
		System.out.println("After N traverse ");//traverse top row
		for(int j = 0 ; j<arr7.length ;j++) {
			System.out.print(arr7[j][0]+" ");
	}
		for(int i =0 ;i<arr7.length-1 ; i++) {  //traverse diagonal from top right to bottom left
			System.out.print(arr7[i][arr7.length-1-i]+" ");
		}
		for(int j = 0 ; j<arr7.length ;j++) {  // traverse the bottom row
			System.out.print(arr7[j][arr7.length-1]+" ");
		}
		
		
		
		
		System.out.println();
		System.out.println("===================");         //doubt
		System.out.println(" circular...");
		int arr8[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int countt = 0;
		int count1 = 1 ;
		int count2 = 2 ; 
		
		for(int j = 2; j>=0 ;j--) {
			System.out.print(arr8[j][count1]+" ");
		}
		for(int j= 0 ; j<1 ; j++ ) {
			System.out.print(arr8[j][count1]+" ");
		}
		for(int j = 0 ; j<3 ; j++) {
			System.out.print(arr8[j][count2]+" ");
		}
			
		
		System.out.println();                           //doubt
		System.out.println("===============");
		System.out.println("ZIG ZAG traverse......");
		int [][]arr9 = { {1,2,3},{4,5,6},{7,8,9} };
		for(int i=0 ;i< 3 ;i++) {
			for(int j =0 ; j<3 ;j++) {
				System.out.print(arr9[i][j]+" ");
			}
			System.out.println();
		}
		for(int i= 0 ; i<arr9.length ; i++) {
			System.out.print(arr9[0][i]+" ");
		}
		for(int i= 0 ; i<arr9.length ; i++) {
			System.out.print(arr9[1][i]+" ");
		}
		for(int i= 0 ; i<arr9.length ; i++) {
			System.out.print(arr9[2][i]+" ");
		}
	
		System.out.println();
		System.out.println("=======================");
		System.out.println(" vertical transvernsal...");
		int arr10[][] = {{1,8,9},{2,7,10},{3,6,11},{4,5,12}};
		int col = arr10[ 0].length ;
		int  row =  arr10.length;
		
		for(int i =col-1 ;i>=0 ; i--) {
			for(int j = 0 ;j<row ; j++) {
				System.out.print(arr10[j][i]+" ");
				
			}
		}
		
		System.out.println();
		System.out.println("================");
		System.out.println(" n travers by sir");
		int arr11[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i= arr11.length-1 ;i>=0 ; i--) {
			System.out.print(arr11[i][0]+" ");
		}
		for(int i = 1 ; i <arr11.length-1 ;i++) {
			System.out.print(arr11[i][i]+" ");
		}
		for(int  i = arr11.length-1 ; i>=0 ; i--) {
			System.out.print(arr11[i][arr11.length -1]+" ");
		}
		
//		
//		System.out.println();
//		System.out.println("================");
//		System.out.println(" printing 4 corner values");
//		int arr12[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int r = arr12.length;
//		int c = arr12[0].length;
//		for(int i  =r/2 , j=c-1 ; i>=0 && j>c/2 ; i-- ,j++ ) {
//			System.out.println(arr12[i][j]+" ");
//		}
//		for(int i  =1 , j=c/2-1 ; i>=r/2 && j>=0 ; i++ ,j-- ) {
//			System.out.println(arr12[i][j]+" ");
//		}
		
		System.out.println();System.out.println("=================");
		System.out.println(" for counting number in variable");
		int arr13 [] = {1,0,2,0,0,0,1,2,0,2};
		int c0 =0;
		int c1 =0;
		int c2 =0;
		
	      for(int i =0 ; i < arr13.length ;i++ ){
	    	  if(arr13[i]==0) {
	    		  c0++;
	    		  
	    	  }
	    	  if(arr13[i]==1) {
	    		  c1++;
	    		  
	    	  }
	    	  if(arr13[i]==2) {
	    		  c2++;
	    		  
	    	  }
	    	  
	      }
	      System.out.println("total number of 0 = "+c0);
	      System.out.println("total number of 1 = "+c1);
	      System.out.println("total number of 2 = "+c2);
		
	      
	      System.out.println();
	      System.out.println("=============");
	      System.out.println(" zig zag");
	      int arr14[][]= {{1,2,3},{4,5,6},{7,8,9}};
	      for(int i =arr14.length-1;i>=0;i--) {
				 System.out.print(arr14[0][i]+" ");
			}
			for(int i=0; i< arr14.length; i++) {
				System.out.print(arr14[1][i]+" ");
			}
			for(int i=arr14.length-1; i>=0;i--) {
				System.out.print(arr14[2][i]+" ");
			}
		
//	      System.out.println();
//	      System.out.println("=============");
//	      System.out.println(" digonal sum ");
//	      int arr15[][]= {{1,2,3},{4,5,6},{7,8,9}};
//	      int counttt =0 ;
//		  for(int i = 0; i<arr15.length;i++) {
//			//  counttt =counttt+ arr15[i][j] ;
//		  }
		  
		 
			System.out.println();
	        System.out.println("=============");
		    System.out.println("Repeating the array  ");
		    int arr16[]= {1,2,3};
		    for(int i = 0; i <arr16.length ; i++) {
		    	System.out.print(" "+arr16[i]);
		    }
		    for(int i = 0; i <arr16.length ; i++) {
		    	System.out.print(" "+arr16[i]);
		    }
		    
		    System.out.println();
	        System.out.println("=============");
		    System.out.println("digonally  sum   ");
		    int arr17[][]= { {1,2,3},{4,5,6},{7,8,9}} ;
		    for(int i =0 ;i<arr17.length ;i++) {
		    	for(int j =0 ;j<arr17.length ; j++) {
		    		System.out.print(arr17[i][j]+ " ");
		    	}
		    	System.out.println();
		    }
		    System.out.println();
		    System.out.println("====================");
		    System.out.println( " Rhombus traversal........ " );
		    int [][] arr18 = {{1,2,3},{4,5,6},{7,8,9}};
		   int r = arr18.length ;
		   int c = arr18[0].length ;
		   for(int i = r/2 ,j =c-1 ; i>=0 && j>=c/2 ; i-- ,j--) {
			   System.out.print(arr18[i][j]+" ");
		   }
		   for(int i =1,j =c/2-1; j<=r/2  && j>=0 ; i++,j--) {
			   System.out.print(arr18[i][j]+" ");
		   } 
		   for(int i = r-1,j =c/2 ; i<r  && j< c ;i++,j--) {
			   System.out.print(arr18[i][j]+" ");
		   }
		   
		   
		   
//		    System.out.println();
//		    System.out.println("====================");
//		    System.out.println( "Adding of number in swastic format........ " );
//		    int [][] arr19 = {{1,2,3,4,5 },{4,5,2,1,6},{7,8,1,2,9},{1,2,3,4,5 },{4,5,2,1,6}};
//		    int sum  = 0 ;
//		     for(int i = 0 ;i<arr19.length/2 ;i++ ) {
//		    	sum = sum + arr19[i][0];
//		    	//System.out.println(sum +" ");
//		     }
//		     
//		     for(int i = 1 ;i<arr19[0].length ;i++ ) {
//			    	sum = sum + arr19[arr19.length/2][i];
//			    	System.out.print(sum +" ");
//			     }
//		    
		    
		    
		    
		   
		    
		    
//		    System.out.println();
//		    System.out.println("====================");
//		    System.out.println( "zig zag traversal by sir  ........ " );
//		    int [][] arr20 = {{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{6,7,8,9,10}};
//		    for( int i = 0 ; i < arr20.length ; i++) {
//		    	if(i % 2 ==0 ) {
//		    		for( int j =arr20[0].length -1 ; i>= 0 ; j--) {
//		    			System.out.print(arr20[i][j]+" ");
//		    		}
//		    	}
//		    	else {
//		    		for(int j =0 ;j<arr20[0].length  ; j++) {
//		    			System.out.print(arr20[i][j]+" ");
//		    		}
//		    	}
//		    }
		    
		   
		
		//end of code
}
}
