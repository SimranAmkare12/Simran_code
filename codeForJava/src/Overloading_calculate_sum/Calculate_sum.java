package Overloading_calculate_sum;

public class Calculate_sum {    // overloading
     public static  int add(int a ,int b) {    //static
	     return a+b;
     }
     public static  int add(int a ,int b,int c) {    //static
	     return a+b+c;
     }
  
  public static int add() {
	  return 0;
  }
  
  public static void main(String args[]) {
	  int a= 12;int b=23; int c=34;
	   int e = add(a,b);
	   int d= add(a,b,c);
	   System.out.println("the sum of number "+e);
	   System.out.println("the sum of number "+d);
	   System.out.println("the sum of number "+add());
  }
}
