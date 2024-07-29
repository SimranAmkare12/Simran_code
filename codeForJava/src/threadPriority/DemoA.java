package threadPriority;

public class DemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		Thread t=  new Thread(obj);
		
		t.start();
		
		
		try {
			t.join();
			t.sleep(3);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		int result = obj.sum;
		
//		for(int i=1 ; i<10 ; i++) {
//			System.out.println("inside main thread.....");
//			System.out.println(result);
//		}
		
		System.out.println(result);
		
	}

}
