package homework;

public class BankAccount {
	int balance = 0 ;
	
	public void deposite() {
		balance = 100 ;
		System.out.println("Balance of your account is  "+balance);
	}
	public void deposite(int amt , String transaction ) {
		
		balance = amt ;
		System.out.println("Your balance "+balance);
		System.out.println("Your transaction msg is --"+transaction);
	}

	public void deposite(int account_no , int amt) {
		balance = amt ;
		System.out.println("Balance of your account is "+amt);
		System.out.println("Transfer from this account number "+account_no);
		
	}
	public static void main(String[] args) {
		
		 BankAccount account1 = new  BankAccount();
		 account1.deposite();
		 account1.deposite(25000, "i deposite this money for future ");
		 
		 BankAccount account2 = new  BankAccount();
		 account2.deposite(12345678, 36000);
	}

}
