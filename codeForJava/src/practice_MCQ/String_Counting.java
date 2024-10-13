package practice_MCQ;

public class String_Counting {
	
	public int Count(String s) {
		
		String s2 = s.replaceAll("[^a-zA-z]", "");
	
		return s2.length();
		
	}
	

	public static void main(String[] args) {
		
		String_Counting  sc = new String_Counting();
		System.out.println(sc.Count("gjfasy416347@133")); 
		
		
		
	}

}
