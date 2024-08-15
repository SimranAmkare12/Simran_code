package threadCommunication;

public class Main {

	public static void main(String[] args)// throws InterruptedException{
	{	
		 TotalEarning te = new  TotalEarning ();
		 
		 te.start();
		 
		 synchronized(te) {
			 try {
				 te.wait(); // wait for main method
			 }
			 catch(Exception e){
				 System.out.println(e);
			
			 } 
			
		 }
		 System.out.println("hello");
		 System.out.println("Total earning -- Rs "+te.total);
		 System.out.println("end");
	}

}