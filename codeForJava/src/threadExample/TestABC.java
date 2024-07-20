package threadExample;

public class TestABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA t1 = new ThreadA() ;
		ThreadB t2 = new ThreadB() ;
		ThreadC t3 = new ThreadC() ;
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 90 ; i<=99 ; i++) {
			System.out.println(i+ " Inside TestABC");
		}
		
		
	}

}
