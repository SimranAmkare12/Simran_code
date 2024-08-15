package labda_expression;

import java.util.function.*;

public interface PredicateExample {
	
//	public static void main(String[] args) {
//		Predicate<Integer> pre = (a )-> a != null ;
//		System.out.println(pre.test(7));
//	}
	
	
	public static void main(String[] args) {
		Predicate<String> pre = (b)->  b.contains("y");
		System.out.println(pre.test("y"));
	}
	
	//bi
	
	
	

}
