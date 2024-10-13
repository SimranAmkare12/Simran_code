package dsa;  //recursion

public class Recursion {
	
	static  int a = 0;
	static  int b  = 0; 
	static int c ;
	public static void fibonaccie(int num) {
		
		if( num > 0) {
			System.out.println(a);
			c = a +b ;
			a =b ;
			b =c ;
			 fibonaccie(num -1 );
		}
	}
	
	
	public static int factorial(int g) {
		
		if(g == 0) {
			return 1 ;
		}
		else {
			return g *factorial(g-1);
		}
		
	}
	public static void  print(int n) {
		if(n > 0) {
			print(n-1);
			System.out.print(n+" ");
			
		}
	}
	public static int sum(int number ) {
		 if (number == 0) {
	            return 0;
	        } else {
	            return number % 10 + sum(number / 10);
	        }
	}
	


	public static void main(String[] args) {
		
	   
	    
		int ans = factorial(5);
		System.out.println(ans);
		print(5);
		int summ = sum(23);
		System.out.println(summ);
		
		fibonaccie(4);
	
	/***	
		int [] arr = new int [5];
		arr[0]=0;
		arr[1] = 1 ;
		 
		for(int i = 2 ; i <5 ; i++) {
        arr[i] =arr[i-1] + arr[i-2];
		}
		for(int i :arr) {
			System.out.print(i+ " ");
		}
 ***/
	}

}
