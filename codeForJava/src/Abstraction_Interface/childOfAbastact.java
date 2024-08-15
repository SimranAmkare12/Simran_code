package Abstraction_Interface;

public class childOfAbastact extends DemoAbstract  {


	 childOfAbastact(){
		 super();
		 System.out.println(" constructor");
	 }
	
	@Override
	public void saveCustomerDetail() {
		 
		System.out.println(" saving customer detail...");
	}

	@Override
	public void takeLoan() {
		// TODO Auto-generated method stub
		System.out.println(" taking loan...");
	}
	
	public void test() {
		System.out.println(" trying");
	}
	
     public static void main(String[] args) {
		
	Demo o = new Demo();
	
	o.diplay();
	}
	

}
