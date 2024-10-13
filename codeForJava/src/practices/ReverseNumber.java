package practices;

public class ReverseNumber {
	
	public static int reverse(int num) {
		int rev = 0 ;
		
		while(num > 0) { // 231
		    int rem = num %10 ; 
		    rev = rev *10 + rem ;
			 num= num/10 ;  
		}
		
		return rev ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int ans = reverse(1200000456);
		System.out.println(ans);
		
	}

}
