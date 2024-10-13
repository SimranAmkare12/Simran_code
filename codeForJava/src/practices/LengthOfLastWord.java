package practices;

public class LengthOfLastWord {

	static int l =0 ;
	public static int count(String str) {
		
		str= str.trim();
		for(int i= str.length()-1 ; i >= 0 ; i--) {
			if(str.charAt(i) !=  ' ') {
				l++ ;
			}
			else if(l > 0){
				break ;
			}
		}
		return l ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = " Hello java ";
       System.out.println(count(s));
	}

}
