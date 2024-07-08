package collection_framework;

import java.util.Stack;

public class Stack_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stk = new Stack<>();
        stk.push(10);
        System.out.println(stk);
        stk.push(20);
        System.out.println(stk);
        stk.push(30);
        System.out.println(stk);
        stk.push(40);
        System.out.println(stk);
        stk.push(50);
        System.out.println(stk);
      
        System.out.println("top elemnt of stack "+stk.pop());
        if(stk.pop() == 40) {
        	System.out.println("stack is not empty ");
        	System.out.println(stk);
        	
        }
        
        System.out.println( "peek "+stk.peek());     //show top element without removing it
        
        
        if(stk.isEmpty()) {
        	System.out.println(" empty stack ");      // check stack is empty o not
        }
        else {
        	System.out.println("stack is not empty ");
        }
        stk.clear();
        System.out.println("elent of stack after clearing "+stk);
        
 
	}

}
