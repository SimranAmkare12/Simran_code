package singletonExample;

public class Test {

	public static void main(String[] args) {
		
		Worker w1 = Worker.getobject();
		System.out.println(w1.hashCode());
		
		Worker w2 = Worker.getobject();
		System.out.println(w2.hashCode());
		
		System.out.println();
		
		System.out.println(Labour.getobject().hashCode());
		System.out.println(Labour.getobject().hashCode());
		
	}

}
