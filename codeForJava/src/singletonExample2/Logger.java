package singletonExample2;

public class Logger {

	public static Logger log ;
	
	private Logger() {   //private constructor that disallow to create object
		
	}
	public static Logger getLogIn() {   // method that create object for only once
		if(log == null) {
			log = new Logger() ;
			System.out.println("Logging is successful.... \n");
		}
		
		return log ;  //return object
	}
	
}
