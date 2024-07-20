package threadExample;          //implementing Runnable interface

public class Y implements Runnable {

	@Override
	public void run() {
		
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("Table of 2----"+i*2);
		}
		
		
	}

	
	
}
