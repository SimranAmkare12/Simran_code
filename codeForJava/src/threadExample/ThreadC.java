package threadExample;

public class ThreadC extends Thread {
	
	
public void run() {
		
		for(int i = 31 ; i<=40 ; i++) {
			System.out.println(i+ " Inside threa-C ");
		}
		
	}

}
