package method_constractor_reference;

import java.util.*;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {
		List<String > names = Arrays.asList("A","B","C","D","E");
		List<Student> std = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
		
		System.out.println(std);
		//names.forEach(TestStudent :: new  Student );
	}

}
