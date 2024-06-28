package interface_example;

public class Mahindra implements car , Truck {

	@Override
	public void acceleration(int force) {
		
		System.out.println(" yes speed is increasing at 20km/sec");
		
	}

	@Override
	public void brek() {
	
		System.out.println(" break");
	}

	@Override
	public void horn() {
	System.out.println(" horn");
		
	}

	@Override
	public void heavyload() {
		System.out.println(" heavy load...by truck");
	}

}
