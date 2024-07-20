package threadExample;

public class DemoX {
	public static void main(String[] args) {
		
		X x1 = new X() ;
	//	x1.run();   // act as normal method
		
		x1.start();
		
		for(int i = 0 ; i<=90 ; i++) {
			System.out.println(i+ " second thread ");
		}
		
		
		////////////////////////////////
		
//		
//		 ThreaddBB tt = new  ThreaddBB();
//		  Thread sec  = new  Thread(tt) ;
//		  sec.start();
//
//		  for(int i = 0 ; i<=90 ; i++) {
//				System.out.println(i+ " second thread ");
//			}
//					
		
		
		
	}

}
