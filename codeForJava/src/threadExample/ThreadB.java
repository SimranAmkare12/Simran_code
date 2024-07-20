package threadExample;

public class ThreadB extends Thread {
	
public void run() {
		
		for(int i = 20 ; i<=30 ; i++) {
			System.out.println(i+ " Inside threa-B ");
		}
		
	}
	

}
