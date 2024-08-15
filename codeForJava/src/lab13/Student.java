package lab13;

public class Student {
	
	 String name ;
	 int age ;
	 String department ;
 
	 
	// default constructor	 
	  Student( ){     
		name= "unknown";
		department = "unassigned" ;
		age = 20;
		
		
		 
	 }
	 
	//constructor 2 parameter with 
	 public Student(String name , int age){
		this.name = name;
		this.age = age;
		this.department = "it";
		 
	}
	  
	 //constructor with 3 parameter
	  Student(String name , int age, String department) {
		 
		   this.name = name;
		   this.age = age;
		   this.department = department;
	 }
	  
	 
	

}
