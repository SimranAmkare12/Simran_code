package Overriding_example_1;

public class BankAccount {
	
  public static int deposit(int amt) {
	  return amt;
  }
  public static int deposit(int amt,String name) {
	  return( amt );
	  
  }

 public static void main(String args[]) {
	 System.out.println(" simply deposit the amount of $ "+deposit(1200));
 }
}
