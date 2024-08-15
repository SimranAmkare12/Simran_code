package practice_MCQ;

import java.util.stream.Stream;

public class StreanObject {

	public static void main(String[] args) {
		
		System.out.println("Strarting of rogram");
		
		Stream<Object> emptystream = Stream.empty();  //creating empty stream
		emptystream.forEach(e ->{
			System.out.println(e);
		});
		
		String names [] = {"simran ","Harshi","ritesh"};   
		Stream<String>  nn =Stream.of(names);               //creating stream from String
		nn.forEach(e ->{
			System.out.println(e);
		});
		
		
	}

}
