package labda_expression;

import java.util.function.*;

public interface SupplierExample {
	
//	public static void main(String[] args) {
//		Supplier<String> obj = ()-> "Enter your name.... ";
//		System.out.println(obj.get());
//	}

	
	public static void main(String[] args) {
		 
		Runnable r = ()-> System.out.println(" runnable ");;
		Thread t = new Thread(r);
		t.start();
	}
	
	
	
}
