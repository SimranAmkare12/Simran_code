package singletonExample2;

public class TestLogger {

	public static void main(String[] args) {
		 Logger log1 = Logger.getLogIn();  //calling method for 1st time
		 System.out.println("Login for 1st time");
		 System.out.println("Logging id :"+log1.hashCode());// return some hashcode
		 
		 System.out.println();
		 
		 System.out.println("Login for 2nd time");
		 
		 Logger log2 = Logger.getLogIn();  //calling method for 2nd time
		 System.out.println("Logging id :"+log2.hashCode());  // return the same same hashcode again
        //it will show only once you will logged in
	}

}
