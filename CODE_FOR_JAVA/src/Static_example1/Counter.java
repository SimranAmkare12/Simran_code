package Static_example1;

public class Counter {
	
	 static int count =0;
	public static void increment() {
		count++;
	}
	public static int getCount() {
		return count;
	}
	
	public static void main(String args[]) {
		
		Counter.increment();
		Counter.increment();
		Counter.increment();
		Counter.increment();
		Counter.increment();
	
		System.out.println("the increased value is "+Counter.getCount());
		
		
	}

}
