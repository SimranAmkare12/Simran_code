package lab18;

import java.util.*;
import java.util.stream.Collectors;

public class ConcatenateString {

	public static void main(String[] args) {
		
		List<String> word = new ArrayList<>();
		word.add("H");
		word.add("E");
		word.add("L");
		word.add("L");
		word.add("O");
		
		String new_word = word.stream().collect(Collectors.joining());
		
		System.out.println("String after concetenation --"+new_word);
	}

}
