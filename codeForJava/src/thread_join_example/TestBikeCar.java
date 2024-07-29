package thread_join_example;

public class TestBikeCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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


