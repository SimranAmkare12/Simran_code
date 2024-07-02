package java_bean_example;

public class Emplyoee {
	
	 int emp_id ;
	 String emp_name;
	 String emp_department;
	 String emp_salary;
	 
	 Emplyoee(int i ,String n , String d ,String s){ // parameterized constructor
		 this.emp_id = i;
		 this.emp_name =n;
		 this.emp_department = d;
		 this.emp_salary =s ;
				 
		 
	 }
       Emplyoee(){  // default constructor
    	  
      }
       public void display() {
          System.out.println("new empyoee information-------------------->");
    	   System.out.println( "emplyoee _id "+this.emp_id+"  emplyoee _ "+this.emp_name+"  emplyoee _department "+this.emp_department+ "  empyoee _salary "+ this.emp_salary);
    	   System.out.println("");
       }
      


}
