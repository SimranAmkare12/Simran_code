package method_constractor_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		List<String> name = Arrays.asList("simran","harshita","reena");
		 name.forEach(MethodReference :: print );
		
	}

}
