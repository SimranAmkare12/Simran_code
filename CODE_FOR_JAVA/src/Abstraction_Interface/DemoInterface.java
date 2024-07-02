package Abstraction_Interface;

public interface  DemoInterface {

	
	
	public void updateCustomer();
	
	static void showcustomer() {
		System.out.println(" show customer");
	}
    default void show() {
    	System.out.println("   shoinh default    ");
    }
}
