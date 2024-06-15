package sim;

public class Example_of_loop_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("simran project");
		                                     //reverse right half pyramid
		
		System.out.println(" ");
		System.out.println("reverse right half pyramid");
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//                                          box of five *
		
		System.out.println(" "); 
		System.out.println("  rectangle of five *");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	                                      	//right half pyramid
		System.out.println(" ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		                                   // hollow rectangle
		System.out.println(" ");
		System.out.println(" hollow rectangle ");
		int n=4 ;int m=5;
		for(int i=1 ; i<=n ;i++) {
			 for(int j=1 ;j<=m ;j++) {
				 if(i ==1 || j==1 || i==n || j==m) {
					 System.out.print("*");
					 
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			System.out.println(); 
		}
		
		                            //left half pyramid
		System.out.println("  ");
		System.out.println("  left half pyramid ");
		int p =4;
		for(int i =1 ; i<=p ; i++ ) {
			//loop for space
			for(int j=1 ;j<=p-i ; j++) {
				System.out.print(" ");
			}
			// loop for *
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		                            // triangle of number pattern start with 1
		System.out.println(" ");
		System.out.println("triangle start with 1 ");
		int q =5;
		for(int i = 1 ; i<=q ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		                       //triangle of number pattern start with 5
		System.out.println(" ");
		System.out.println(" triangle start with 5 ");
		int r = 5;
		for(int i =1 ; i<=r ; i++) {
			for(int j=1 ; j<=n-i+1 ;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		                              // triangle pattern of number from 1 to 15
		System.out.println(" ");
		System.out.println(" triangle of number 1 to 15 ");
		int s =6 ;int number =1 ;
		for(int i =1 ; i<=s  ; i++) {
			for(int j=1 ;j<=i ; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
		                         // zero one triangle
		System.out.println(" ");
		System.out.println(" zero one triangle ");
		int t= 5;
		for(int i =1 ; i<=t ; i++) {
			for(int j=1 ; j<=i ; j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	                                  	// table 2 to 20
		int a =1;
		for(int i =1 ;i<=20;i++)
		{
			for(int j =1 ; j<=10 ;j++) {
				a=i*j;
				System.out.println(a+" ");
			}
			System.out.println(i+" table is ended");
		}
		
                  		        //reverse right half pyramid using if else statement
		System.out.println();
		System.out.println("reverse right half pyramid using if else statement");
		for(int i=1 ; i<5 ; i++) {
		for(int j =0 ;j<5-i ;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		                            // left half pyramid using if else statement
		System.out.println();
		System.out.println("left half pyramid using if else statement");
	for( int i=5; i>0 ;i-- ) {
		for(int j=0 ; j<5 ; j++) {
			if(j<i-1) {
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
		
	         // reverse left half pyramid using if else statement
	System.out.println("  ");
    System.out.println("reverse left half pyramid using if else statement ");
        for(int  i=0;  i<5 ; i++) {
	      for(int j = 0 ;j<5 ;j++) {
	    	  if(j<i) {
	    		  System.out.print( " ");
	    	  }
	    	  else
	    	  {
	    		  System.out.print("*");
	    	  }
	      }
	      System.out.println();
          }
        
        //practice
        
        // zero one triangle
        for(int i =1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
        
        
        // k pattern 
        System.out.println();
        for(int i=5 ;i>0 ;i--) {
        	for(int j= 1;j<=i ;j++) {
        		System.out.print("*");
        	}
        	System.out.println(" ");	
        }
        for(int i=1 ;i<=5;i++) {
        	for( int j=1 ;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        // while loop
         int i= 1;
         while(i<=10) {
        	 System.out.print(i);
        	 if(i==6) {
        		 System.out.println("end");
        		 break;
        	 }
        	 i++;
        	 
         }
         
         //do while loop
         int y = 1;
         do {
        	 System.out.println(" here i am");
         }
         while(i<=5);{
        	 System.out.println(i);
        	 i++;
         }
         
         
	// end of code  .......
	}

}
