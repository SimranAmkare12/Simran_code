package Bank_overloading;

public class BankAccount {

	  public void deposit(int amt){
		System.out.println(" your amt is "+amt);
	}
	  
	  public void deposit(int amt ,String username){
		  System.out.println(" Your name is "+username+" and amt is "+amt);
		}
	  public static void main(String[] args) {
		  BankAccount b = new  BankAccount();
		  b.deposit(11000);
		  b.deposit(2000, " harshita choursiya");
	}
}
