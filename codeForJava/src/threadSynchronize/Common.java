package threadSynchronize;

public class Common {
	
	public static synchronized void fun1(String name) {  // after making it synchronized it will produce regular output
		
		System.out.println("welcome");
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception ee) {
			
		}
        System.out.println(name);
	}
	
}
