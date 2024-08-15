package generic;

import java.util.*;

public class Container<T> {
   
	private  ArrayList<T> arr ;
	
	public Container() {
		arr = new ArrayList<T>();
	}
	
	public void add(T obj) {
		arr.add(obj);
	}
	
	public T remove(T obj) {
		return obj;
	}
	
	public T  getIndex(int index) {
		
		T ans= arr.get(index);
		return ans;
	}
	
	public int size(int s) {
		
		return s;
	}
	
}
