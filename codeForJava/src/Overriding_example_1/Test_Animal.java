package Overriding_example_1;

public class Test_Animal {

	public static void main(String[] args) {
	
		Animal a = new Animal();
		a.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
		
		Cat c= new Cat();
		c.makeSound();
		
		Cow cw = new Cow();
		cw.makeSound();

	}

}
