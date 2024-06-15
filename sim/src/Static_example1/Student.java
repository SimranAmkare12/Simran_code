package Static_example1;
public class Student {

	String name ;
	String subject ;
	static String collegname = "IES";
	public static void learn() {
		  System.out.println("running");
		 
		  //collegename ="bansal";
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Student s= new Student();
		s.name = "Simran";
		s.subject ="bca";
		
		
		Student s1= new Student();
		s1.name = "reean";
		s1.subject ="mca";
		System.out.println("hello");
		
       // System.out.println(Student.learn());
		System.out.println("simran amkare");
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.collegname);
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.collegname);	
	}

}
