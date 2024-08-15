package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collector.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);nums.add(7);nums.add(5);
		nums.add(4);nums.add(1);nums.add(3);
		

//		for(int s : nums) {
//			System.out.println(s);
//		}
		
		Stream s = nums.stream() ;
		//System.out.println(s);
		
		s.forEach(x -> System.out.print(x+" ")); // using consumer taking one argument and return nothing
		//s.forEach(x -> System.out.print(x)); //s will not use again beacuse stream pipeline object work only once
		
		System.out.println("Streamed data....!");
		Stream<Integer> newnums =nums.stream().map(n -> {System.out.println("mai hu map function");
		                                                     System.out.println(n);
		                                                         return n*n ;
	                                                     	})
				                                          .filter(f -> { System.out.println("mai hu filter function");
		                                                           System.out.println(f);
		                                                            return f %2 == 0;
	                                                      	});
		
		try {
			Thread.sleep(7000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		
		List<Integer> listlist = newnums.collect(Collectors.toList());
		for(Integer j : listlist) {
			System.out.println(j);
			
		}

		
	}

}
