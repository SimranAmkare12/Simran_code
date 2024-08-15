package practice_MCQ;

public class Main {
	
    public static void main(String[] args) {
//    	 Practice p1 = new Practice() {
//
//    			@Override
//    			public void sayhello() {
//    				System.out.println("hello 1");
//    			}
//    	    	 
//    	     };
//    	     p1.sayhello();    	    	
    	
    	// by using lambda expression
 /*   	
    	Practice p =  () ->{
    		
    		System.out.println("hello 1");
    		
    	};
    	
    	p.sayhello();
    	
   */ 
    	
    	/*
    	Practice p1 = new Practice() {

			@Override
			public void sayhello() {
				System.out.println("hello");
			}

			@Override
			public void sayByee() {
				System.out.println("byee");
				
			}
    		
    	};
    	p1.sayByee();
    	p1.sayhello();
    */	
//    	Lenghher l = (str) -> str.length(); 
//    	
//    	System.out.println(l.getlength("rakhi"));
//    	
    	
    	
    	//providing implemetation of practice interface
    	
    	//method reference of static method
   
    	   Practice pp = Meet :: meet ;
    	   
    	   pp.sayhello();
  /*  	
    	Runnable run = Meet :: table ;
    	Thread t = new Thread(run);
    	t.start();
   */ 	
    	   
    	   
    	// method reference of instance method or non static method
    	   
  /*  	Meet obj = new Meet();
    	
    	Practice number = obj :: printNumber ;
    	number.sayhello();
    	  
    	*/
    	
    	   
    	   //constructor refrence
    	   
    	   Practice c = Meet :: new;
    	   c.sayhello();
    	
	}
     
}
