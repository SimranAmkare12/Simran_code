package lab13;

public class Main {

	public static void main(String[] args) {
		
		 Student std1 = new Student("simran",20);    // creating object that call constructor with 2 parameter
		  Student std2 = new Student ("Harshi",21,"sales");  //creating object that call constructor with 3 parameter
		  Student std3 = new Student ();  // creating object that call default constructor
		  
		  
		  System.out.println("value of constructor that have 2 parameter");
		  System.out.println("Student name "+std1.name+" student age "+std1.age);
		  
		  
		  System.out.println("value of  constructor that have 3 parameter");
		  System.out.println("Student name "+std2.name+" student age "+std2.age+"student department "+std2.department);
	    
		     
		  System.out.println("value of default constructor");
		  System.out.println("Student name "+std3.name+" student age "+std3.age+" student department "+std3.department);
			
			
		  
		  
		  
	}

}
