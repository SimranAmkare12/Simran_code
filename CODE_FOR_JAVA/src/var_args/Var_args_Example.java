package var_args;

public class Var_args_Example {
	
	static void add(int a , int b) {
		int c = a+b ;
		System.out.println(c);
		
	}
	
	static void add(int ...a) {
		int ans = 0 ;
		for(int result :a) {
			ans = ans + result ;
			
		}
		System.out.println(ans);
	}
	
	static void add(String ...str) {
		String ans = " " ;
		for(String s : str ) {
			ans = ans + s;
		}
		System.out.println(ans );
		
	}
	
	static void add(String a , String b) {
	         String c = a+ b ;
		System.out.println(c);
	}

	public static void main(String[] args) {
	
		add(4,6);
		add(3,4,5,6,1);
		add("simran"," Amkare"," is"," good"," girl");
		add("simran","Amkare");

	}

}
