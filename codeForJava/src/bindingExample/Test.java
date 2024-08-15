package bindingExample;

public class Test {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.animal();
		
	 
		Animal aa = new Dog();   // upcast
		aa.animal();
		
		 
		Dog dd = (Dog)a;    // downcast
		dd.animal();
		dd.dog();
	

	}

}
