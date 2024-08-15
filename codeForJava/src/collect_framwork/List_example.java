package collect_framwork;
import java.util.*;

public class List_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("stack...");
		Stack<Integer> st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		
		
  	for(int i =0 ; i<st.size() ; i++) {
			
			System.out.println(st.get(i));
		}
//		
//		Iterator itr =st.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//			itr.remove();
//		}
//		
		
		
		
		
		////////////////////////////////////////////
		System.out.println();
		System.out.println("linklist...");
		LinkedList<String> list = new LinkedList<>();
		list.add("simran");
		list.add("harshita");
		list.add("nharika");
		
		Iterator itrr =list.iterator();
		while (itrr.hasNext()) {
			  System.out.print( itrr.next()+" ");
			}
		
	/////////////////////////////////////////////////
		
		System.out.println();
		System.out.println("arraylist...");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(24);
		arr.add(36);
		arr.add(48);
		arr.add(60);
		Iterator itrr2 =arr.iterator();
		while (itrr2.hasNext()) {
			
			  System.out.print( itrr2.next()+" ");
			}
		
		
		
		System.out.println();
		System.out.println("vector....");
		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(4);
		v.add(6);
		Iterator itr3 = v.iterator();
		while(itr3.hasNext()) {
			System.out.print(itr3.next()+" ");
		}
		
		
		
	}

}
