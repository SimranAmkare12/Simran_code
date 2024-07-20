package threadExample;

public class ThreadA extends Thread{
	
public void run() {
		
		for(int i = 0 ; i<=10 ; i++) {
			System.out.println(i+ " Inside threa-A ");
		}
		
	}

	
}
