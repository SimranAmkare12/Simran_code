package practices;
import java.util.*;

public class SumOfEvenNumber {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1); arr.add(2);
		arr.add(3); arr.add(4);
		arr.add(5); arr.add(6);
		
		int sum = 0 ;
		for(int i=0 ;i < arr.size() ;i++) {
			if(arr.get(i) %2 == 0) {
				
				sum = sum + arr.get(i) ;
			}
       	}
		 System.out.println("Sum of all even number in a list is "+sum);
	}
	
}
