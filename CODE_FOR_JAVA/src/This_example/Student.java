package This_example;

public class Student {

	int rollno ;
	String name ;
	
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
		
	}
	Student(){
		
	}
	
	public void display() {
		System.out.println(" Roll no "+rollno+" Name "+name);
	}
}
