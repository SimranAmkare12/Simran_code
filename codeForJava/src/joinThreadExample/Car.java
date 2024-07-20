package joinThreadExample;

public class Car extends Thread {
	
	public void run(){
		
		for(int i =0 ;i<=5 ;i++) {
			System.out.println("Car is Running....");
		}
		
	}

}
