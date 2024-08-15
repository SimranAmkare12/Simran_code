package lab19;
import java.util.function.*;

public class StringManipulator {

	public static void main(String[] args) {
	String str = "My Lab Is Completed ";
	
	//to convert into uppercase
		Function<String, String> toUppercase = (r) -> str.toUpperCase() ;
		System.out.println("Uppercase - "+toUppercase.apply(str));
		
		
	//to convert into uppercase
		 Function<String, String> toLowercase = (r) -> str.toLowerCase() ;
		 System.out.println("Lowercase - "+toLowercase.apply(str));
			
	// for reversing string
		Function<String ,String> reverse = r -> new StringBuilder(r).reverse().toString();
		System.out.println("Reverse - "+reverse.apply(str));
		
	}

}
