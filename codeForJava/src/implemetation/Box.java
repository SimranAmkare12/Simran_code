package implemetation;

import java.util.ArrayList;

public class Box<T> {

	
		// TODO Auto-generated method stub
//
//		ArrayList arr =  new ArrayList();
//		
//		arr.add(12);
//		arr.add("swati");
//		arr.add(true);
//		System.out.println(arr);
//		
		
		Object container ;
		public Box(Object container) {
			
			this.container = container ;
		}
		
		public Object getValue() {
			return this.container;
		}


}
