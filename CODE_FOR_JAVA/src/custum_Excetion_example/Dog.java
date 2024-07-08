package custum_Excetion_example;

public class Dog extends Animal {
	
	void docalculation() {
		System.out.println(" dog are genius ...");
	}

	public static void main(String[] args) {
		Dog cc = new Dog() ;
		cc.docalculation();
	}
}
