package Abstraction_Interface;

public class Demo implements DemoInterface {

	 public void diplay() {
		 System.out.println(" display ");
	 }
	 
//	 private Demo() {
//		 System.out.println("demo hu me");
//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//DemoAbstract a  = new  DemoAbstract();
		
		// cant be instanciated
		
		childOfAbastact aa = new childOfAbastact();
		Demo d = new Demo();
		d.show();
		d.updateCustomer();
		
		aa.bankLogo();
		aa.saveCustomerDetail();
		aa.takeLoan();
		aa.test();
		
		DemoInterface.showcustomer();
		
		
		
	}
	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("bsdk");
	}

}
