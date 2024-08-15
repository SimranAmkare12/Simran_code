package labda_expression;

import java.util.function.*;

public interface FunctionExample {
	
	public static void main(String[] args) {
		
		 Function<Integer,Boolean> obj = (a)->a< 5;
		 System.out.println(obj.apply(8));
	}
	

}
