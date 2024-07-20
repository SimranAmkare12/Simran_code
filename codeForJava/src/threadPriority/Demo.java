package threadPriority;     // setting name of thread

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String thread_name = Thread.currentThread().getName();
		
		System.out.println(thread_name);
		
		
		ThreadA ss = new ThreadA();
		Thread x = new Thread(ss);
		
		Thread y = new Thread(ss);
		
		x.setName("First");
		x.start();
		
		y.setName("Second");
		y.start();
		
		
		System.out.println("Default priority of thread x -"+x.getPriority());
		System.out.println("Default priority of thread y -"+y.getPriority());
		
	
		
		
		x.setPriority(9);
		y.setPriority(8);
		
		System.out.println(" x ----"+x.getPriority());
		System.out.println(" y-----"+y.getPriority());
		
		
	}

}
