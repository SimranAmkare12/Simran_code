package threadSynchronize;

public class TestAB {

	public static void main(String[] args) {
		
        Common c = new Common() ;     //lock 
		
		ThreadA t1 = new ThreadA(c,"Ajay");   // calling the parameterized ThreadA constructor
		
		ThreadA t2 = new ThreadA(c,"Vijay");   // / calling the parameterized ThreadB constructor
		
		t1.start();
		
		t2.start();

	}

}
