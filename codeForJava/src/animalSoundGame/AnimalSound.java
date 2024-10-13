package animalSoundGame;

public class AnimalSound implements Dog,Cat{
	
	@Override
	public void cat() {
		System.out.println("Meow Meow");
		
	}

	@Override
	public void dog() {
		System.out.println("Bhaw Bhaw");
		
	}

	public static void main(String[] args) {
       System.out.println("Welcome to animal sound game");
       int ch = 0 ;
       switch(ch) {
       case 1 : {
    	   Dog d = new Dog();
    	   d.dog();
    	   break ;
       }
       case 2 : {
    	  Cat c = new Cat();
    	  c.cat();
       }
       default :{
    	   
       }
       }
    
	}

	

}
