package This_example;

public class Animal {

	void safety(Animal a) {
		System.out.println(" safety..");
	}
	void eat() {
		safety(this);
		System.out.println("eat");
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
	}
}
