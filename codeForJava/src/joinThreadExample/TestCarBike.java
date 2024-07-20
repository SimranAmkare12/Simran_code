package joinThreadExample;

public class TestCarBike {

	public static void main(String[] args) {
	
		Car c= new Car() ;
		c.start();
		
		try {
			c.join();
		}
		catch(InterruptedException e) {
			
			System.out.println(e);
		}
		
		Bike b = new Bike();
		b.start();
		

		try {
			b.join();
		}
		catch(InterruptedException e) {
			
			System.out.println(e);
		}
		
		System.out.println("testing is done..");
		 

	}

}
