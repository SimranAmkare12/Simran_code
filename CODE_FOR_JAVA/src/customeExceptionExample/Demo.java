package customeExceptionExample;

public class Demo extends Bank {

	public static void main(String[] args) {
		
		 Demo bb=  new Demo();
		try {
			bb.withdraw(10);
			//return ; //   finally k bad ka code excute nhi hoga due to return
		}
		catch(Low_balance_exception e) {
			System.out.println(e);
			// return ; // 
		}
		
		try {
			bb.deposite(6669966);
		}
		catch(Too_much_amt_Exception e) {
			
			System.out.println(e);
		}
		finally{
			System.out.println(" you are most welcome..");
			
		}
		System.out.println(" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
	}
}
