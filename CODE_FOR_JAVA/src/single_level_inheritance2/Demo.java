package single_level_inheritance2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amimal a = new Amimal();
		
		a.eat();
		Dog d = new Dog();
		d.legs=4;
		d.eye=2;
		d.tail=12;
		System.out.println(d.legs);
		System.out.println(d.eye);
		
		d.speek();
		d.eat();
		
	}

}
