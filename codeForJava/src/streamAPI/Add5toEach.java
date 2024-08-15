package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add5toEach {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>() ;
		number.add(23);
		number.add(40);
		number.add(11);
		number.add(12);
		
		List<Integer> newnum = number.stream().filter(f -> f %2 ==0).map(m -> m+5)
				.collect(Collectors.toList()) ;
		
		System.out.println(newnum);
		
	}

}
