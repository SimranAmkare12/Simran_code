package threadPriority;  

public class ThreadA implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<= 5 ; i++) {
			
			String tname = Thread.currentThread().getName();
//			if(tname.equals("First"));{
//				
//				Thread.sleep(1000);
//			}
			
			System.out.println(tname+" current thread");
		}
		
	}
	
	

	

}
