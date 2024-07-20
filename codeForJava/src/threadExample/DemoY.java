package threadExample;

public class DemoY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Y t1 = new Y() ;
         Thread obj = new Thread(t1);
         obj.start();
         
         for(int i =1 ; i<=10 ; i++) {
 			System.out.println("Table of 3----"+i*3);
 		}
 		
		
		
	}

}
