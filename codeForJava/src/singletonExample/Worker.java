package singletonExample;

public class Worker {
	// lazy way to create singleton object
	
	private static  Worker wrk ;
	
	private  Worker() {
		
	}
	public static  Worker getobject() {
		
		if( wrk== null) {
		  
			wrk = new Worker();
		}
		
		return  wrk;
	}
	

}
