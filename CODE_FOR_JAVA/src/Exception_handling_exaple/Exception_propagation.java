package Exception_handling_exaple;

public class Exception_propagation {
	
	 static void calculation() {
		System.out.println(" before exceptio");
		int a = 12 / 0 ;
		System.out.println(" it is working");
	}
	public static void main(String[] args) {
		System.out.println(" running..");
		N obj = new N();
		obj.n();
	}
	
}
class M
{
	static void m() {
		System.out.println(" this is m in M before ");
		try {
			Exception_propagation.calculation();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		System.out.println(" this is m inM after ");
	}
}
class N{
	  void n() {
		  System.out.println(" this is n in N before");
		 M.m();
		 System.out.println(" this is n in N after");
	 }
	
}

