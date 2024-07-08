package upcasting_downcasting;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Animal();
        obj.animal();
        
    //    obj.dog();
        	
        	
        	Animal obj1 = new Dog();    //up casting 
        	obj1.animal();
        	
        	Dog obj2 = (Dog)obj;    // down casting
        	obj2.dog();
        	obj2.animal();
        	
		
	}

}
