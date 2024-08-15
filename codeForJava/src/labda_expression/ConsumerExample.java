package labda_expression;

import java.util.function.*;

public interface ConsumerExample {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> obj = (a,b) -> System.out.println(" hiiii "+a+b);
		obj.accept(88,44);
	}
	

}
