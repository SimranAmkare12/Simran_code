package This_example;

public class Bike {
      
	//void run() {
		//this(100);
	//}
	public Bike() {
		this(10);
	}
    public Bike(int speed) {
		System.out.println(" run in more then 100 speed"+speed);
	}
    public static void main(String[] args) {
		Bike b = new Bike();
		Bike b1 = new Bike(89);
	}
}
