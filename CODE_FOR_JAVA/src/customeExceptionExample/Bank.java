package customeExceptionExample;

public class Bank {
    
	 int amt = 500 ;
	 
	 public void withdraw(int payment)throws Low_balance_exception {
		 if(amt <= 500) {
			throw new Low_balance_exception(" your amount is low ");
			 
		 }
		 else {
			 amt = amt - payment ;
			 System.out.println(" This is your payment kindly recieve");
		 }
	 }
		 
		public int deposite(int paisa)throws Too_much_amt_Exception {
			if(paisa > 100000) {
				throw new Too_much_amt_Exception("you have to go bank manually ");
			}
			amt = amt + paisa ;
			return amt ;
		
		 
	 }
	
}
