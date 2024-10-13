package dsa;
import java.util.*;
import java.util.stream.Collectors;
public class AppendLinkedList {
/***	static class Node{
		int data ;
		Node next ;
		Node(int d  ){
			data = d;
			next = null ;
		}	
	}
      public static Node print (Node head) {
		
		Node current = head ;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next ;
		}
		return head;
		
	}
	***/
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();  //  20 30 10
		list1.add(10);  
		list1.add(20);
		list1.add(30);
		
		LinkedList<Integer> list2 = new LinkedList<>();   // 40 50 60
		list2.add(40);
		list2.add(50);                    //  20 30 10 40 50 60
		list2.add(60);
		System.out.println("list");
		
		LinkedList<Integer> l3 = new  LinkedList<Integer>();
		list1.addAll(list2);
		System.out.println(list1);
	}
	
}
