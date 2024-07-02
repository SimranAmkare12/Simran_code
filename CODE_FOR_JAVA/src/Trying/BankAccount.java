package Trying;

public class BankAccount {
	
	int deposite;
	public void Deposite(int deposite) {
		System.out.println(" My Deposite is "+deposite);
	}
	
    public void Deposite(int deposite, int salary) {
		System.out.println(" "+deposite+" and salary is  "+salary);
	}
   
    
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.Deposite(1000);
		account.Deposite(500, 20000);
		
	}

}
