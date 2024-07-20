package implemetation;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Box box = new Box(" this is string");
//		System.out.println(box.getValue());
//		
//		Box box2 = new Box(30);
//		box2.container = true ;
//		System.out.println(box2.getValue());
		
		Box<String> tt =  new Box<String>("vivo ");
		 //tt.container = true ;
		System.out.println(tt.getValue());
		
		Box<Integer> tt2 =  new Box<Integer>(123);
		 //tt2.container = true ;
		System.out.println(tt2.getValue());
		
		
		
		
		
	}

}
// not implementing type safety