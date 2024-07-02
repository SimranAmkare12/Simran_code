package This_example;

public class Animal {

	void safety() {
		System.out.println(" safety..");
	}
	void eat() {
		this.safety();
		System.out.println("eat");
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
	}
}
