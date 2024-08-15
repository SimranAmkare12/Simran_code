package thread_collable;
import java.util.concurrent.*;

public class MyCollable implements Callable
{
 
	int num;
	
	public MyCollable(int num) {    //parameterize constructor
		
		this.num = num;
	}

	@Override
	public Object call() throws Exception {  //overriding the callable interface method
		
		System.out.println(Thread.currentThread().getName()+"....is responsible to find the sum of first "+num+" number");
		
		int sum = 0;
		for(int i=1 ; i<=num ;i++) {
			sum = sum +i ;   // calculating sum of n natural number
		}
		return sum;
	}

}
