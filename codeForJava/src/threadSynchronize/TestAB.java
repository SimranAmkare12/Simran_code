package threadSynchronize;

public class TestAB {

	public static void main(String[] args) {
		
        Common c = new Common() ;     //lock 
		
		ThreadA t1 = new ThreadA(c,"Ram");
		
		ThreadA t2 = new ThreadA(c,"Shyam");
		
		t1.start();
		
		t2.start();

	}

}
