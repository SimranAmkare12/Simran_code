package collect_framwork;
import java.util.*;

public class Set_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//not allow duplicate value
		//not maintain insertion order
		//allow single null value
		//allow unique value(using hashing)
		System.out.println("hashset.... ");
		//System.out.println();
		HashSet<String> ss = new HashSet<String>();
		ss.add("a");
		ss.add("b");
		ss.add("f");
		ss.add("c");
		ss.add("d");
		ss.add("a");
		ss.add("e");
		ss.add("c");
		ss.add(null);
		ss.add(null);
		for(String s : ss) {
			System.out.print(s+" ");
		}
		
		
		
		                      //allow single nul value
		System.out.println();//maintain insertion order
		System.out.println();
		System.out.println(" linkedhashset..");
		LinkedHashSet<String> l = new LinkedHashSet();
		l.add("h");
		l.add("e");
		l.add("e");
		l.add("l");
		l.add("l");
		l.add(null);
		l.add(null);
		l.add("o");
		for(String x : l) {
			System.out.print(x+" ");
		}
		
		
		
		                     //not allow null value
		System.out.println();//sort the list by default
		System.out.println("treeset....");
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(0);
		t.add(8);
		t.add(5);
		//t.add(null);
		System.out.println(t);
		
		
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ram");
		ts.add("shyam");
		ts.add("geeta");
		ts.add("arti");
		ts.add("arti");
		System.out.println(ts);
		
		
		
		
		
	}

}

