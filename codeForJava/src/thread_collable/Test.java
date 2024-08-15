package thread_collable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws Exception{
		
		MyCollable[] x1 = {     // creating array of class type to create object 
				
				new MyCollable(10),
				new MyCollable(20),
				new MyCollable(30),
				new MyCollable(40),
				new MyCollable(50),
				
		};
		
		ExecutorService obj = Executors.newFixedThreadPool(3);   // creating object of ExecutorService 
		
		for(MyCollable x2 : x1) {
			Future f = obj.submit(x2);  // sumiting
			System.out.println(f.get());  // returing future class object
		}
           obj.shutdown();
	}

}
