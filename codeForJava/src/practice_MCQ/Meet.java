package practice_MCQ;

public class Meet {
	
	public Meet() {
		System.out.println("constructor reference ......");
	}

	public static void meet() {
		System.out.println("nice to meet you");
		
	}
	public static void table() {
		for(int i = 1 ;i <= 10 ; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void printNumber() {
		for(int i = 1 ;i<=10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
