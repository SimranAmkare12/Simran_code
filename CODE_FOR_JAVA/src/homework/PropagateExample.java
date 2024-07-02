package homework;

public class PropagateExample {

	public void animal() {
//		System.out.println(" before animal");
      //dog();
		System.out.println(" after animal ");
	}
	public void dog() {
		//System.out.println(" before dog ");
		animal();
		//System.out.println(" after dog");
	}
	public void cat() {
		try {
			dog();
		}
		catch(Exception e) {
			System.out.println("Exception handled... ");
		}
	}
	public static void main(String[] args) {
		PropagateExample obj = new PropagateExample();
		obj.cat();
		System.out.println(" normal flow...");

	}

}
