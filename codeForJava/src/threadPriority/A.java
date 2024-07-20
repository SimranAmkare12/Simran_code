package threadPriority;

public class A implements Runnable{

	int sum ;
	@Override
	public void run() {
		
		for(int i =1 ;i<=5 ;i++) {
			
			sum= sum + i ; 
			System.out.println("inside thread");
		}
		
	}

}
