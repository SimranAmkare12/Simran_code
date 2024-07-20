package implemetation;
import java.util.*;

public class StackImplementaion {
	static final int max = 1000 ;
	int top ;
	int arr[] =  new int[max];
	
	boolean isEmpty() {
//		if(top < 0) {
//			return true ;
//		}
//		else {
//			return false ;
//		}
		
		return top < 0 ;
	}
	
	StackImplementaion(){
		top =-1 ;
		
	}
	
	boolean push(int x) {
		if(top >= max) {
			System.out.println("stack overflow");;
			return false ;
		}	
		//top ++;
		arr[++top] = x ;
		System.out.println("value push successfully !");
		return true ;
		
	}
	
	int pop() {
		
		if(top < 0) {
			System.out.println("stack underflow  !");
			return 0 ;
		}
		
		return arr[top--];
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("stack underflow  !");
			return 0 ;
		}
		
		
		return arr[top];
	}

      void print() {
    	  for(int i = top ; i>= 0 ;i --) {
    		  System.out.print(arr[i]+" ");
    	  }
    	  
      }
      
      
      public static void main(String[] args) {
		 
    	  StackImplementaion st = new StackImplementaion();
    	  st.push(12);
    	  st.push(23);
    	  st.push(34);
    	  st.push(24);
    	  
    	  System.out.println(st.pop());
    	  
    	  System.out.println(" top element"+st.peek());
    	  
    	st.print();
    	  
	}
	
}
